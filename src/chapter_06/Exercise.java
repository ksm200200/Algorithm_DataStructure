package chapter_06;

import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.IntStack;


public class Exercise {
	
	//실습 6-10
	static void quickSort2(int[] a, int left, int right) {
		
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);

		lstack.push(left);
		rstack.push(right);

		while (lstack.empty() != true) {
			int pl = left  = lstack.pop();		// 왼쪽 커서
			int pr = right = rstack.pop();		// 오른쪽 커서
			int x = a[(left + right) / 2];		// 피벗

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);				// 왼쪽 그룹 범위의 
				rstack.push(pr);				// 인덱스를 푸시합니다.
			}
			if (pl < right) {
				lstack.push(pl);				// 오른쪽 그룹 범위의 
				rstack.push(right);				// 인덱스를 푸시합니다.
			}
		}
	}
	
	//실습 6-9
	static void quickSort(int[] a, int left, int right) {
		
		int pl = left;				//왼쪽 커서
		int pr = right;				//오른쪽 커서
		int x = a[(pl + pr) / 2];	//피벗
		
		do {
			while(a[pl] < x) {
				pl++;
				System.out.println(a[pl]);
			}
			while(a[pr] > x) {
				pr--;
				System.out.println(a[pr]);
			}
			if(pl <= pr) {
				System.out.println(a[pl]+ ", " + a[pr]);
				swap(a, pl++, pr--);
				System.out.println(a[pl]+ ", " + a[pr]);
			}
			
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);		//재귀호출
		if(pl < right) quickSort(a, pl, right);		//재귀호출
	}
	
	
	//실습 6-8
	 static void partition(int[] a, int n) {
		 int pl = 0;   		//왼쪽 커서
		 int pr = n - 1; 	//오른쪽 커서
		 int x = a[n / 2];  //피벗(가운데 위치 값)
		 
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
			
		} while(pl <= pr);
		
		
		System.out.println("피벗의 값은 " + x + "입니다.");
		System.out.println("피벗 이하의 그룹");
		
		for(int i = 0; i <= pl - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		if(pl > pr +1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i = pr + 1; i <= pl - 1; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i = pr + 1; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	 }
	 
	
	
	
	
	//실습 6-7
	static void shellSort2(int[] a, int n) {
		int h;
		for(h = 1; h < n / 9; h = h * 3 + 1) ;
		
		for(; h > 0; h /= 3) {
			for(int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j =i - h; j >= 0 && a[j] > tmp; j =- h) {
					a[j + h] = a[j];
					a[j + h] = tmp;
				}
			}
		}
		
	}
	
	//실습 6-6
	static void shellSort(int[] a, int n) {
		
		for (int h = n / 2; h > 0; h /= 2) {
			
			for(int i = h; i < n; i++) {
				
				int j;
				int tmp = a[i];
				
				for(j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	//실습 6-5
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j -1]> tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
			System.out.println("-----------------");
			
			for(int k = 0; k < a.length; k++) {
				System.out.println("a[" + k +"] = " + a[k]);
			}
		}
	}
	
	//실습 6-4 단순선택 정렬
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}
	
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
		for(int i = 0; i < a.length; i++) {
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
		
		System.out.println("퀵 정렬(비재귀 버전)");
		System.out.print("요솟수：");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}

		quickSort(x, 0, nx - 1);			// 배열 x를 퀵 정렬합니다.

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
		
		
		/*실습 6-10
		System.out.println("퀵 정렬");
		System.out.println("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x, 0, nx - 1);
		
		System.out.println("오른차순으로 정렬을했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		
		/*실습 6-8
		System.out.println("배열을 나눕니다.");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		partition(x, nx);
		*/
		
		/*실습 6-7
		System.out.println("셸 정렬(버전 2)");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = sc.nextInt();
		}
		
		shellSort(x, nx);
		
		System.out.println("오른차순으로 정렬을했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/		
		/*
		System.out.println("셸 정렬(버전 1)");
	
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = sc.nextInt();
		}
		
		shellSort(x, nx);
		
		System.out.println("오른차순으로 정렬을했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		/*실습 6 - 6
		System.out.print("단순 선택 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = sc.nextInt();
		}
		
		insertionSort(x, nx); //배열 x를 단순삽입 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		
		
		/*실습 6-3
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
		*/
		
		
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
