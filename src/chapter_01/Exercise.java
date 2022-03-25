package chapter_01;

import java.util.Scanner;

public class Exercise {
	
	
	//실습 1-2
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		
		/*실습 1-7
		System.out.println("--------------곱셈표-------------");
		for(int i = 1; i <= 9; i++) {	
			for(int j = 1; j <= 9 ; j++ ) {
				System.out.printf("%3d", j*i);
			}
			System.out.println();
		}
		*/
		
		/*실습 1-6
		int n;
		System.out.println("1부터 n까지의 합을 구합니다.");
		do {
			System.out.print("n의값: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
		*/
		
		/*실습 1-5
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		*/
		
		/* 실습 1-4
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		*/
		
		
		
		
		/*실습 1-2
		System.out.println("max(3,2,1) = " + max3(3,2,1) + " = a");
		System.out.println("max(1,3,2) = " + max3(1,3,2) + " = b");
		*/
		
		
		
		/*실습 1-1
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		System.out.println("최대값은 : " + max + " 입니다");
		*/
		
		System.out.println();
		
		
		
		
		
		
		
		sc.close();	
	
		
	
		
	}
}
