package chapter_03;

/* 실습 3C-1
class Id {

	private static int counter = 0;    //아이디를 몇개 부여했는지 저장
	private int id;
	
	//생성자
	public Id() {
		id = ++counter;
	}
	
	//아이디를 반환하는 인스턴스 메서드
	public int getId() {
		return id;
	}
	
	public static int getCounter() {
		return counter;
	}
}
*/


public class Supplement {

	//실습 3C-3
	static class GenericClass<T> {
		
		private T xyz;
		
		GenericClass(T t){  //생성자
			this.xyz = t;
		}
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		
		
		/*실습 3C-3
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		*/
		
		
		/*실습 3C-1
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 아이디: " + a.getId());
		System.out.println("b의 아이디: " + b.getId());
		
		System.out.println("부여한 아이디의 개수: " + Id.getCounter());
		*/
	}
	
	

}
