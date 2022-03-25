package chapter_01;

import java.util.Scanner;

public class Practice_Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		//실습 1-7
		System.out.println("--------------곱셈표-------------");
		for(int i = 1; i <= 9; i++) {	
			for(int j = 1; j <= 9 ; j++ ) {
				System.out.printf("%3d", j*i);
			}
			System.out.println();
		}
	
	
		
	
		
	}
}
