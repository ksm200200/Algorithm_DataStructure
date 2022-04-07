package chapter_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Practice {
	
	//연습문제 3-7
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
		
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparaotor();

		private static class VisionOrderComparaotor implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? 1 :
					(d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}
	
	
	//연습문제 3-3
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[count] = i;
				count++;
			}
		}
		return count;
	}

	
	
	//연습문제 3-2
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색성공
		}
		return -1; // 검색실패
	}
		
		
		
	//연습문제 3-1	
	static int seqSearchSen(int a[], int n, int key) {
		int i;
		a[n] = key;     //보초를 추가
			
		for(i = 0; i < n; i++ ) {
			if(a[i] == key) {
				break;     //검색 성공!
			}
			
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String agrs[]) {
		
		Scanner sc = new Scanner(System.in);
		
		/*연습문제 3-7
		PhyscData[] x = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		System.out.print("찾으시는 시력이 몇입니까? >> ");
		double vision = sc.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터: " + x[idx]);
		}
		*/
		
		
		
		/*연습문제 3-6
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
			int insPoint = -idx - 1;
			System.out.println("그 값의 요소가 없습니다.");
			System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
			System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 배열의 정렬 상태가 유지됩니다.", insPoint, ky);
		} else {
			System.out.println(ky +"은(는) x[" + idx + "]에 있습니다.");
		}
		*/
		
		
		/*연습문제 3-3
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		
		int count = searchIdx(x, num, ky, y);
		
		if(count == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("key의 개수는: " + count + "개이고" );
			for(int i = 0; i < count; i++) {
				System.out.println("그 값은 " + "x[" +y[i] + "]에 있습니다.");
			}
			
		}
		*/		
		
		/*연습문제 3-2
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1]; //요솟수 num +1
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearchEx(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
		*/
		
		
		/*연습문제 3-1
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
		
	}

}
