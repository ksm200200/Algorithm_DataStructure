package chapter_01;

import java.util.Scanner;

public class Exercise_Main {
	
	//오른쪽 아래가 직각인 이등변 삼각형
	
	static void triangleRD(int n) {
		for(int i = n; i >= 1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("");
			}
			for(int j = n; j >= 1; j++) {
				System.out.print("*");
				System.out.println();
			}
		}
	}
	
	
	
	//오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			for(int k = n; k >=i; k-- ) {
				System.out.print(" ");
			}
		}
	}
	
	
	
	//왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLD(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println("");
			}
		}
	
	
	//왼쪽 위가 직각인 이등병 삼각형
	static void triangleLU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println("");
			}
		}
	
	
	public static void main(String[] args) {
		Exercise_Main main = new Exercise_Main();
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k >=i; k-- ) {
				System.out.print("*");
				
			}
		}
		
		
		//연습문제 1-15
		//main.triangleRU(10);// 오른쪽 위가 직각인 이등변 삼각형
		//main.triangleLU(5);// 왼쪽 위가 직각인 이등변 삼각형
		//System.out.println(); 
		//main.triangleLD(5); //왼쪽 아래가 직각인 이등변 삼각형

		
			
	
		
		
		
		
	}
}
