package chapter_01;

import java.util.Scanner;

public class Practice {
	
	
	//연습문제 1-17, n단 피라미드를 숫자로 출력
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n - i; k++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= ((i-1) * 2 + 1); j++){
				System.out.print(i);
			}
			System.out.println();

		}
	}
	
	///연습문제 1-16, n단 피라미드 출력
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n - i; k++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j <= ((i-1) * 2 + 1); j++){
				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	
	
	
	
	// 연습문제 1-15
	//오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRD(int n) {
		for(int i = 1; i <= n; i++) {       // i행 (i = 1, 2, … ,n)
			for(int j = 1; j <= n-i; j++) 	// n-i로 " " 나타냄
				System.out.print(" ");
			for(int k = 1; k <= i; k++) {
				System.out.print("*");      // k = i로 행과 *의 숫자가 같음
			}
			System.out.println();
		}
	}
	
	//오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {          //i는 행
			for(int k = 1; k <= i-1; k++) {    //k는 i - 1로  " "(띄어쓰기)이다. 
				System.out.print(" ");
			}
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
	//왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLD(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//왼쪽 위가 직각인 이등병 삼각형
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {            //i는행 
			for(int j = 1; j <= n-i+1; j++) {    //j는 별의 숫자
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	//연습 1-9
	static int sumof(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
		
		/*while(a <= b) {
			sum += a;
			a++;
		}
		return sum;*/
	}
	
	
	
	public static void main(String[] args) {
		Practice p = new Practice();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		//p.npira(5); 연습문제 1-17
		//p.spira(9); 연습문제 1-16 	
		
		/*연습문제 1-15 
		p.triangleLD(5);      //왼쪽 아래가 직각인 이등변 삼각형
		System.out.println(); 
		p.triangleLU(5);      // 왼쪽 위가 직각인 이등변 삼각형
		System.out.println();
		p.triangleRD(5);        // 오른쪽 아래가 직가인 이등변 삼각형
		System.out.println();
		p.triangleRU(5);      // 오른쪽 위가 직각인 이등변 삼각형
		*/
		
		
		
		
		
		/*연습문제 1-13
		System.out.print("  |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n--+---------------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
		*/
		
		
		
		/*연습문제 1-12
		System.out.print("  |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n--+---------------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		*/
		
		
		
		/*연습 1-11
		String length = null;
		int n;
		System.out.println("양의 정수의 자리를 구하겠습니다.");
		do {
			System.out.print("양의 정수를 입력하세요: ");
			n = sc.nextInt();
			if(n > 0) {
				length = Integer.toString(n);
				break;
			} else continue;
		} while(n < 0);
		System.out.println("이 정수는 " + length.length() + "입니다.");
		*/
		
		
		/*연습 1-10
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		
		while(true) {
			System.out.print("b의 값: ");
			int b  = sc.nextInt();
			if(b > a) {
				System.out.println("b - a는 " + (b - a) + "입니다.");
				break;
			} else {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		}
		*/
		
		
		/*연습 1-9
		System.out.println("5부터 9까지의 합 = " + sumof(5, 9));
		System.out.println("5부터 9까지의 합 = " + sumof(10, 40));
		*/
		
		
		/* 연습 1- 8
		System.out.println("1부터 정수 n까지의 합을 가우스의 법칙을 이용해 구해라");
		System.out.print("정수 n입력: ");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		System.out.println(sum);
		*/
		
		
		/*연습 1-7
		System.out.println("정수 1부터 n까지의 합 구하기");
		System.out.print("정수  n을 입력하세요: ");
		int sum = 0;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(i);
			sum += i;
			if(i != n) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
		*/
		
	}
}
