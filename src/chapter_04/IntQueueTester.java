package chapter_04;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntQueue q = new IntQueue(10); //최대 64개를 인큐할 수
		
		while(true) {
			System.out.println("현재 데이터 수 : " + q.size() + "/" + q.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: " );
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x = 0;
			switch(menu) {
			case 1:				//인큐
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					q.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2: 			//디큐
				try {
					x = q.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException E) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
				
			case 3:				//피크
				try {
					x = q.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			case 4:				//덤프
				q.dump();
				break;
			
			//연습문제 4-5
			case 5:
				System.out.print("검색할 숫자를 입력하세요: ");
				int n = sc.nextInt();
				int index = q.search(n);
				if(index != 0) {
					System.out.println("검색한 " + n + "는 que[" + index +"]에 있습니다.");					
				} else {
					System.out.println("찾으시는 값은 없습니다.");
				}
				break;
			
			case 6:
				System.out.print("검색할 숫자를 입력하세요: ");
				int n2 = sc.nextInt();
				int index2 = q.search2(n2);
				if(index2 != 0) {
					System.out.println("검색한 " + n2 + "는" + index2 + "번째에 있습니다.");					
				} else {
					System.out.println("찾으시는 값은 없습니다.");
				}
				break;
				
			}
		
		}
		
	}

}
