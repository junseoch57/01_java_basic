package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 2024-02-16 19:39~
 * 
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		System.out.println();
		
		int bulgogiBurgerOrderCnt = 0;
		int shrimpBurgerOrderCnt = 0;
		int colarOrderCnt = 0;
		
		int idx = 0;
		while (idx <= 5) {
			System.out.println("메뉴 선택: ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				bulgogiBurgerOrderCnt++;
			}
			else if (choice == 2) {
				shrimpBurgerOrderCnt++;
			}
			else if (choice == 3) {
				colarOrderCnt++;
			}
			
			idx++;
		}
		
		int totalPrice = bulgogiBurgerOrderCnt * bulgogiBurgerPrice + shrimpBurgerOrderCnt * shrimpBurgerPrice + colarOrderCnt * colaPrice ;
							
		System.out.println("총 금액 :" + totalPrice);
		
		System.out.println("현금 입력 :" );
		int yourMoney = scan.nextInt();
		

		
		if (yourMoney >= totalPrice) {
			
			int charge = totalPrice - yourMoney;
			
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1.불고기 버거 : " + bulgogiBurgerOrderCnt + "개");
			System.out.println("2.새우    버거 : " + shrimpBurgerOrderCnt + "개");
			System.out.println("3.콜         라 : " + colarOrderCnt + "개");
			System.out.println("4.총  금  액 : " + totalPrice + "원");
			System.out.println("5.잔         돈 : " + charge + "원");
			
		}
		else {
			System.out.println("금액이 부족합니다!");
		}
		

		
		scan.close();
	}
	

}
