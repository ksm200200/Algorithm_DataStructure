package chapter_02;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
	
	//실습 2-5
	static int maxOf_2(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}

	
	//실습 2-4
	static int maxOf(int[] a) {
		
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*실습 2-5
		Random random = new Random();
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람의 수: ");
		int human = sc.nextInt();
		
		int[] height = new int[human];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < human; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		System.out.println("최대값은 " + maxOf_2(height) + "입니다.");
		*/
		
		
		/*실습 2-4
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int human = sc.nextInt();
		int[] height = new int[human];
		
		for(int i = 0; i < human; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		*/
		
		
		/* 실습 2-3
		int[] a = {1, 2, 3 ,4 , 5};
		int[] b = a.clone(); //b는 a의 복제를 참조
	
		b[3] = 0;
	
		System.out.print("a = ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("b = ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		*/
		
		
		/* 실습 2-3
		int[] a = {1, 2, 3, 4, 5}; // 배열 초기자에 의해 생성
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		*/
		
		/*실습 2-1
		int[] a = new int[5];
		a[1] = 37;
		a[2] = 12;
		
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = "+ a[i]);
		}
		*/
		
	}

}
