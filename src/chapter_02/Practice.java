package chapter_02;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	
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
