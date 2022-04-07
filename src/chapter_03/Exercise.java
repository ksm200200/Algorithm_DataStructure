package chapter_03;

import java.util.Scanner;

public class Exercise {
	
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
		
		//실습 3-3
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
