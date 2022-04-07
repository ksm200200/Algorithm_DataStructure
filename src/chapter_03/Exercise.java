package chapter_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise {
	
	//실습 3-8
	static class PhyscData {
		private String name;     //이름
		private int height;      //키
		private double vision;   //시력
		
		public PhyscData(String name, int height, double vision) {
			
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparaotor();

		private static class HeightOrderComparaotor implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	
	
	//실습 3-4
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;   //첫번째 요소
		int pr = n-1; // 마지막 요소
		
		do {
			int pc = (pl+pr) / 2;      //중앙 요소의 인덱스
			
			if(a[pc] == key) {         //검색 성공!
				return pc;            
			} else if(a[pc] <  key) {  // 검색 범위를 뒤쪽 절반으로 좁힘
				pl = pc + 1;          
			} else {                   // 검색 범위를 앞쪽 절반으로 좁힘
				pr = pc - 1;
			} 
			
		} while(pl <= pr);
		return -1;
	}
	
	

	//실습 3-3
	static int seqSearchSen(int a[], int n, int key) {
		int i = 0;
		
		a[n] = key;     //보초를 추가
		
		while(true) {
			if(a[i] == key) break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	
	//실습 3-2,  3-1 보다 갈결한 for문
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key) return i;
		}
		return -1;
	}
	
	
	/*실습 3-1
	요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if (i == n) return -1;
			if (a[i] == key)  return i;
			i++;
		}
	}
	*/
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		

		/* 실습 3-8
		PhyscData[] x = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		
		System.out.print("몇 cm인 사람을 찾고 있나요? >> ");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터: " + x[idx]);
		}
		*/
		
		/*실습 3-6
		String[] x = {
				"abstract",   "assert",       "boolean",   "break",      "byte",
				"case",       "catch",        "char",      "class",      "const",
				"continue",   "default",      "do",        "double",     "else",
				"enum",       "extends",      "final",     "finally",    "float",
				"for",        "goto",         "if",        "implements", "import",
				"instanceof", "int",          "interface", "long",       "native",
				"new",        "package",      "private",   "protected",  "public",
				"return",     "short",        "static",    "strictfp",   "super",
				"switch",     "synchronized", "this",      "throw",      "throws",
				"transient",  "try",          "void",      "volatile",   "while"
			};
		
		System.out.print("원하는 키워드를 입력하세요. >> ");
		String ky = sc.next();
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("해당 키워드가 없습니다.");
		} else {
			System.out.println("해당 키워드는  x[" + idx + "]에 있습니다.");
		}
		*/
		
		
		/*실습 3-5
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();				
			} while(x[i] < x[i-1]);
		} 
		
		System.out.println("검색할 값: ");
		int ky = sc.nextInt();
		//기본 자료형 메소드
		int idx = Arrays.binarySearch(x, ky);    //배열 x에서 키 값이 ky인 요소를 검색
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky +"은(는) x[" + idx + "]에 있습니다.");
		}
		*/
		
		
		
		/*실습 3-4
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0]: " ); //첫 요소 입력
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]); //값이 바로 앞의 요소보다 작으면 다시 입력
			
		} 
		
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는)" + "x[" + idx + "]에 있습니다.");
			
		}
		*/
		
		
		
		
		/*실습 3-3
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; //요솟수 num +1
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
		*/
		
		/*실습 3-1
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값의 요소는 x[" + idx + "]에 있습니다.");
		}
		*/
		
		/*실습 3-1
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다. ");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
		*/
		
		
	}
	
	

}
