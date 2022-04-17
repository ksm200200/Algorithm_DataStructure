package chapter_05;

import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.IntStack;

public class Exercise {
	
	//실습 5-6 n개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int n, int x, int y) {
		if(n > 1) {
			move(n - 1, x, 6 - x- y);
		}
		System.out.println("원반 [" + n + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
		
		if(n > 1) {
			move(n - 1, 6 - x- y, y);
		}
	}
	
	
	
	//실습 5-5 스택을 사용한 비재귀적 recur메서드
	static void recur3(int n) {
		
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);               //n의 값을 푸시
				n = n - 1;
				continue;
			}
			if(s.empty() != true) {     //스택이 비어 있지 않다면
				n = s.pop();            //저장하고 있던 스택의 값을 팝
				System.out.println(n);  
				n = n - 2;
				continue;
			}
			break;
		}
		
		
	}
	
	
	//실습 5-4 꼬리 재귀를 제거했습니다.
	static void recur2(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n -2;
		}
	}
	
	
	//실습 5-3
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	//실습 5-2
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;      
		} else {
			return gcd(y, x % y);   // x % y 가 0이 될때 까지 반복 후 나눴을때 나머지가 0이되면 나눈 값을 반환
		}
	}
	
	
	//실습 5-1
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반의 개수: ");
		int num = sc.nextInt();
		
		move(num, 1, 3);
		
		/* 실습 5 - 3,4,5
		int x = sc.nextInt();
		recur(x);
		System.out.println("-------");
		recur2(x);
		System.out.println("------");
		recur3(x);
		
		/*실습 5-2
		System.out.println("두 정수의 최대공약수를 구합니다. ");
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();
		
		System.out.println("최대 공약수는 " + gcd(x,y) + "입니다.");
		*/
		
		/*실습 5-1
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
		*/
	}

}
