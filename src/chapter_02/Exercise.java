package chapter_02;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
	
	static final int VMAX = 21;
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
			
		}	
	}
	
	static double aveHeight(PhyscData[] dat) {  //키의 평균값 구함
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist) {  //시력분포를 구함
		int i = 0;
		dist[i] = 0;
		
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX /10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	
	
	//실습 2-13
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31 ,30, 31, 30, 31}
	};
	
	//서기 year년은 윤년인가(윤년:1 / 평년:0)
	static int isLeap(int year) {                 //실습 2-13
		//4로 나누어떨어지고 100으로 나누어 떨어지지 않으면 윤년:1이고 400으로 나누어 떨어지면 평년:0이다.
		return ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {  //실습 2-13 
		int days = d;
		
		for(int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];
		}
		return days;
	}
	
	
	//실습 2-8
	static int CardConvRev(int x, int r, char[] d) {
		int digits = 0;
		// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {                    //변환 후의 자릿수
			d[digits++] = dchar.charAt(x % r);
			x/=r;
		} while(x != 0);
		return digits;
	}
	
	
	//실습 2-7
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {           //배열 a와 배열b의 길이 비교
			return false;
		}
		for(int i = 0; i < a.length; i++) {  //배열a와 배열b의 요소 값 비교
			if(a[i] != b[i]) {
				return false;
			}	
		}
		return true;
		
	}
	
	//실습 2-6
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메소드
	static void swap(int[] a, int idx1, int idx2) {  //실습 2-6
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t; 
	}
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {			//실습 2-6
		for(int i = 0; i < a.length / 2; i++) {   
			swap(a, i, a.length - i -1); // 첫번째와 마지막, 두번째와 마지막-1, 세번째와 마지막-2, ...... 요소의 자리 바꿈
		}
	}
	
	
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
		
		PhyscData[] x = {
			new PhyscData("박현규",162, 0.3),
			new PhyscData("김선민",173, 0.4),
			new PhyscData("함진아",182, 2.0),
			new PhyscData("최윤미",175, 0.7),
			new PhyscData("이수진",168, 1.5),
			new PhyscData("홍연의",171, 0.4),
			new PhyscData("김영준",174, 1.2),
			new PhyscData("박용규",199, 0.1)
			
		};
		
		int[] vdist = new int[VMAX]; //시력분포
		
		System.out.println("----신체검사 리스트----");
		
		System.out.println("이름     키    시력");
		System.out.println("-----------------");
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-5s %3d %5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %5.1fcm \n", aveHeight(x));
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
		}
		
		/*실습 2-13
		int retry;l
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년: "); int year = sc.nextInt();
			System.out.print("월: "); int month = sc.nextInt();
			System.out.print("일: "); int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다. \n", dayOfYear(year, month, day));
			
			System.out.println("한번 더 할까요? (1.예 / 0.아니오): ");
			retry = sc.nextInt();
		} while(retry == 1);
		*/
		
		/*실습 2-12
		int[][] x= new int[2][4];  //2차원 배열 선언
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		System.out.println(x.length);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j] );
			}
		}
		*/
		
		/*실습 2-11, 1000이하의 소수를 열고(버전3)
		int counter = 0;             //곱셈과 나눗셈의 횟수 
		int ptr = 0;                 // 찾은 소수의 개수
		int[] prime = new int[500];  // 소수를 저장하는 배열

		prime[ptr++] = 2; // prime[0] = 2
		prime[ptr++] = 3; // prime[1] = 3
		
		for(int n = 5; n <= 10; n += 2 ) {
			boolean flag = false;
			
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if(n % prime[i] == 0) { //나누어 떨어지면 소수가 아님
					flag = true;        // 더이상의 반복은 불필요
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		for(int i = 0; i < ptr; i ++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
		*/
		
		/*실습 2-10, 1000이하의 소수를 열거(버전2)
		int counter = 0;             //나눗셈의 횟수
		int ptr = 0;                 //찾은 소수의 개수
		int[] prime = new int[500];  //소수를 저장하는 배열
		
		prime[ptr++] = 2;            //2는 소수임
		
		for(int n = 3; n <= 10; n += 2) { //대상은 홀수만
			int i;
			
			for(i = 1; i < ptr; i++) {
				counter++;
				if(n % prime[i] == 0)
					break;
			}
			if(ptr == i) {           //마지막 까지 나누어 떨어지지 않음
				prime[ptr++] = n;   //소수라고 배열에 저장
			}
			
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수: " + counter);
		*/
		
		/*실습 2-9, 1000이하의 소수 열거(버전 1)
		int counter = 0; //나눗셈의 횟수
		
		for(int n = 2; n <= 10; n++) {
			int i;
			
			for(i = 2; i < n; i++) { 
				counter++;
				
				if(n % i == 0) {   //나누어 떨어지면 소수가 아님
					break;         //더이상 반복 불필요
				}
			}
			if(n == i) {  //마지막까지 나누어 떨어지지 않음
				System.out.println(n); 
			}
		}
		System.out.println("나눗셈을 수행한 횟수: " + counter);
		
		/*실습 2-8[A] 한번더 보기
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
		*/
		
		/*실습 2-7
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
		System.out.println("배열 a와b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
		*/
		
		/*실습 2-6
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num]; //요솟수가 num인 배열
		
		for(int i = 0; i < num; i ++) {
			System.out.print("x[" + i + "]: " );
			x[i] = sc.nextInt();
		}
		reverse(x); // 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		*/
		
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
