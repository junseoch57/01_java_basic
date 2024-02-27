package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

// 2024-02-15 19:41~
/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		
		int com = ran.nextInt(3);
		
		System.out.println("가위,바위,보 중 하나를 내세요 : ");
		int me = scan.nextInt();
		
		if (me == com) {
			System.out.println("비겼습니다");
		}
		else if (me == 0 && com == 1) {
			System.out.println("졌습니다");
		}
		else if (me == 0 && com == 2) {
			System.out.println("이겼습니다!");
		}
		else if (me == 0 && com == 1) {
			System.out.println("졌습니다");
		}
		
		
		
		
		scan.close();
		
	}

}
