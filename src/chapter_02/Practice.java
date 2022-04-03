package chapter_02;

import java.util.Random;
import java.util.Scanner;

public class Practice {
	
	//연습문제 2-6
	static int CardConvRev(int x, int r, char[] d) {
		int digits = 0;
		// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {                    //변환 후의 자릿수
			d[digits++] = dchar.charAt(x % r);
			x/=r;
		} while(x != 0);
		
		for(int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i -1];
			d[digits - i -1] = temp;
		}
		
		return digits;
	}	
	
	//연습문제 2-5
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[num-i-1] = b[i];
		}
	}
	
	//연습문제 2-4
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}
	
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
		
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 후의 자릿수
		int retry;; //다시한번?
		char[] cno = new char[32]; //변환 후 각 자라의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요(2~36): ");
				cd = sc.nextInt();
			} while(cd < 2 || cd > 36);
			
			 dno = CardConvRev(no, cd, cno);
			
			System.out.println(cd + "진수로는 ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.println(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한번 더 할까요?(1.예 / 0.아니오) : ");
			retry = sc.nextInt();
		} while(retry == 1);
		
		
		/*연습문제 2-5
		System.out.print("배열 a의 요솟수: ");
		int na = sc.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++){
			System.out.print("a[" + i +"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("배열 b의 요솟수: ");
		int nb = sc.nextInt();
		int[] b = new int[nb];		
		for(int i = 0; i < nb; i++){
			System.out.print("b[" + i +"]: ");
			b[i] = sc.nextInt();
		}
		
		rcopy(a, b);
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사했습니다.");
		
		for(int i = 0; i < na; i++) {
			System.out.print(a[i]+ " ");
		}
		*/
		
		
		/*연습문제 2-4
		System.out.print("배열 a의 요솟수: ");
		int na = sc.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++){
			System.out.print("a[" + i +"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("배열 b의 요솟수: ");
		int nb = sc.nextInt();
		int[] b = new int[nb];		
		for(int i = 0; i < nb; i++){
			System.out.print("b[" + i +"]: ");
			b[i] = sc.nextInt();
		}
		copy(a, b);
		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		
		for(int i = 0; i < na; i++) {
			System.out.print(a[i]+ " ");
		}*/
		
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
