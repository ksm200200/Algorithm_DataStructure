package chapter_02;

public class Supplement {
	
	public static void main(String[] args) {
		
		
		//실습 2C-1
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		} 
		double sum = 0;
		
		for(double i : a) {
			sum += i;
		}
		/*for(int i = 0; i < a.length; i++) { //위와 같다.
			sum += a[i]; 
		}*/
		System.out.println("모든 요소의 합은 " + sum + "입니다");
	
	}

}
