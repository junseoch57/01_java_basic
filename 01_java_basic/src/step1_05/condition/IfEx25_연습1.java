package step1_05.condition;

import java.util.Scanner;

/*2024-02-19 20:47 ~
 * 
 *  # 메뉴판
 *  
 *  1번을 선택하면 아래와 같이 화면에 출력 후 종료
 *  1) 쌀떡볶이  3500원
 *  2) 밀떡볶이  3000원
 *  
 *  2번을 선택하면 아래와 같이 화면에 출력 후 종료
 *  1) 찹쌀순대 3500원
 *  2) 피순대 3500원
 *  
 *  3번을 선택하면 아래와 같이 화면에 출력 후 종료
 *  1) 오징어튀김 500원
 *	2) 계란말이 500원
 *	3) 야채튀김 500원
 *  
 *  1,2,3외의 숫자가 입력되면 아래와 같이 화면에 출력 후 종료
 *  1 ~ 3 번중에서 선택하시오
 *  
 * */

public class IfEx25_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------");
		System.out.println("1.떡볶이");
		System.out.println("2.순대");
		System.out.println("3.튀김");
		System.out.println("------------");
		System.out.print("=>");
		int getChoice = scan.nextInt();
		
		switch (getChoice) {
			case 1 -> {
				System.out.println("1.떡볶이");
			}
			case 2 -> {
				System.out.println("2.순대");
			}
			case 3 -> {
				System.out.println("3.튀김");
			}
			default -> {
				System.out.println("다시 선택");
			}
		
		}
		
		
		scan.close();
	}

}
