package chapter_01;

import java.util.Scanner;

public class Supplement {
	
	
	
	//실습 1C-1 중앙값 구하기
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*실습 1C-2
		int n;
		System.out.println("2자리의 정수를 입력하세요.");
		do {
			System.out.println("입력: ");
			n = sc.nextInt();
		} while(n < 10 || n > 99);
		System.out.println("변수 no값은 " + n + "가(이) 되었습니다.");
		*/
		
		
		/*실습 1C-1 중앙값 구하기
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		*/
	}
	
	

}
