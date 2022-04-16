package chapter_05;

import java.util.Scanner;

public class Practice {
	
	

	
	
	
	//연습문제 5-2
	static int gcd(int x, int y) {
		
		while(y != 0) {
			int temp = y;
			y = x % y ;
			x = temp;
		}
		return x;
	}
	
	
	//연습문제 5-1
	static int factorial(int n) {
		int sum = 1;
		for(int i = n; i > 1; i--) {
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*연습문제 5-2
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
		*/
		/*연습문제 5-1
		int n = sc.nextInt();
		System.out.println(factorial(n));
		*/
	}

}
