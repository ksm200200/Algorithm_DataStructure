package chapter_05;

import java.util.Scanner;

public class Practice {
	
	static String[] name = { "첫번째", "두번째", "세번째" };
	
	//연습문제 5-6
	static void move(int n, int x, int y) {
		
		if(n > 1) {
			move(n - 1, x, 6 - x - y);
		}
		System.out.println("원반 [" + n + "]을 " + name[x - 1] + "기둥에서 " + name[y - 1] + "기둥으로 옮김");
		
		if(n > 1) {
			move(n - 1, 6 - x - y, y);
		}
	}
	
	//연습문제 5-5
	static void recur(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;
		
		while(true) {
			if(n > 0) {
				ptr++;
				nstk[ptr] = n;
				sstk[ptr] = sw;
				
				if(sw == 0) {
					n = n - 1;
				} else if(sw == 1) {
					n  = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = nstk[ptr];
				sw = sstk[ptr--] + 1;
				
				if(sw == 2) {
					System.out.println(n);
					if(ptr < 0) 
						return;
				}	
			} while(sw == 2);
		}
	}
	
	
	
	
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
		//연습문제 5-7
		int num = sc.nextInt();
		move(num, 1, 3);
		
		
		
		/*연습문제 5-6
		System.out.print("정수를 입력하세요. : ");
		int x = sc.nextInt();
		recur(x);
		*/
		
		
		/*연습문제 5-5
		int x = sc.nextInt();
		recur(x);
		*/
		
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
