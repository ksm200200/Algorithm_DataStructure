package chapter_06;

import java.util.Scanner;

public class Exercise {
	
	//실습 6-3 버블정렬(버전 3, 6-2를 개선)
	static void bubbleSort3(int[] a, int n) {
		
		int k = 0;    							//a[k]보다 앞쪽은 정렬을 마친 상태
		while(k < n - 1) {
			int last = n - 1;					//마지막으로 요소를 교환한 위치
			for(int j = n - 1; j > k; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			k = last;
		}
		System.out.println(k);
	}
	
	
	
	
	
	//실습 6-2 버블 정렬(버전 2, 6-1을 개선)
	static void bubbleSort2(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;							// 패스의 교환 횟수를 기록합니다.
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			if (exchg == 0) break;					// 교환이 이루어지지 않으면 종료합니다.
			System.out.println(exchg);
		}
	}
	
	
	
	//실습 6-1 버블 정렬(버전 1)
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = n - 1; j > i; j--) {  //패스
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
			for(int z = 0; z < a.length; z++) {
				System.out.println(a[z]);
			}
			System.out.println("--------");
		}
	}
	
	//a[idx1]와 a[idx2]의 값을 바꿉니다.
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 3)");	
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		bubbleSort3(x, nx);     //배열 x를 버블 정렬합니다.
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		
		
		
		
		
		
		/*실습 6 - 2
		System.out.println("버블 정렬(버전 2)");	
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		bubbleSort2(x, nx);     //배열 x를 버블 정렬합니다.
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		
		
		/*실습 6 - 1
		System.out.println("버블 정렬(버전 1)");	
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		bubbleSort(x, nx);     //배열 x를 버블 정렬합니다.
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		
		
		
	}

}
