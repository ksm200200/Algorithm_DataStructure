package chapter_02;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	
	//연습문제 2-3
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	
	//연습문제 2-2
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메소드
	static void swap(int[] a, int idx1, int idx2) {  //연습 2-6
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t;
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {			//연습 2-6
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a["+ i +"]과(와) a[" + (a.length- i- 1) + "]를 교환합니다.");
			swap(a, i, a.length - i -1); // 첫번째와 마지막, 두번째와 마지막-1, 세번째와 마지막-2, ...... 요소의 자리 바꿈
		}
		
	}
	
	
	
	
	//연습문제 2-1
	static int maxOf_2(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*연습문제 2-3
		System.out.print("요솟수는: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("배열 x의 요솟수의 합은: " + sumOf(x));
		*/
		
		/* 연습문제 2-2
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: " );
			x[i] = sc.nextInt();
		}
		System.out.println();
		
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
		*/
		
		
		
		//연습문제 2-2
		
		
		/*연습문제 2-1
		Random random = new Random();
		System.out.println("키의 최대값을 구합니다.");
		int human = 1+ random.nextInt(10);
		System.out.println("사람의 수: " + human + "명");
		
		int[] height = new int[human];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < human; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		System.out.println("최대값은 " + maxOf_2(height) + "입니다.");
		*/
		
		
	}

}
