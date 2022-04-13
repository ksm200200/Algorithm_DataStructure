package chapter_04;

import java.util.Scanner;

//실습 4C-1
public class LastNElements {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];   //입력 받은 값을 저장
		int cnt = 0;            //입력 받은 개수
 		int retry;              //다시 한번?
 		
 		System.out.println("정수를 입력하세요 : " );
		
 		do {
 			System.out.print(cnt + 1 + "번째 정수 : ");
 			a[cnt++ % N] = sc.nextInt();
 			System.out.print("계속 할까요? (예. 1 / 아니오. 0) : ");
 			retry = sc.nextInt();
 		} while(retry == 1);
 		
 		int i = cnt - N;
 		if(i < 0) {
 			i = 0;
 		}
 		for(; i < cnt; i++) {
 			System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i%N] );
 		}
	}

}
