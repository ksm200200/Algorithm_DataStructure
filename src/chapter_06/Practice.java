package chapter_06;

import java.util.Scanner;

public class Practice {
	

	
	
	//연습문제 6-6(단순 선택 정렬)
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i;	//미정렬된 부분 최소 요소의 index
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			for(int m = 0; m < n; m++) {
				System.out.print((m == i) ? "  * " : (m == min) ? "  + " : "    ");
			}
			System.out.println();
			
			for(int m = 0; m < n; m++) {
				System.out.printf("%3d ", a[m]);
			}
			System.out.println();
			swap(a, i, min);
		}
	}
	
	
	
	
	//연습문제 6-3
	static void bubbleSort3(int[] a, int n) {
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // pass에 의한 교환횟수
			System.out.printf("패스%d：\n", i + 1);

			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
					scnt++;
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			if (exchg == 0) break; /* 교환을 수행하지 않으면 종료 */
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");
	}
	
	
	
	
	//연습문제 6-2 버블 정렬 앞의 요소가 더 크면 두 요소 위치 바꾸기
	static void bubbleSort2(int[] a, int n) { 	
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d：\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
		}
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}
	
	//연습문제 6-1 버블 정렬 앞의 요소가 더 크면 두 요소 위치 바꾸기
	static void bubbleSort(int[] a, int n) {	
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 1 ; j++) {  //머리 --> 꼬리로 스캔
				if(a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
			for(int z = 0; z < a.length; z++) {
				System.out.print(a[z] + " ");
			}
			System.out.println();
			System.out.println("--------------");
		}
	}
	
	//연습문제 6 ~ 자리 앞, 뒤 요소 자리 바꾸기
	static void swap(int[] a, int idx1, int idx2) {  //a[idx1]와 a[idx2]의 값을 바꿉니다.			
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*연습문제 6-6
		System.out.print("단순 선택 정렬");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = sc.nextInt();
		}
		
		selectionSort(x, nx);
		
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i +"] = " + x[i]);
		}
		*/
		
		/*연습문제 6- 1, 2
		System.out.println("단순교환정렬(버블정렬, 머리 -> 꼬리로 스캔)");
		
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		//bubbleSort(x, nx);
		System.out.println("-----------");
		//bubbleSort2(x, nx);
		bubbleSort3(x, nx);*/
		
		
		
	}

}
