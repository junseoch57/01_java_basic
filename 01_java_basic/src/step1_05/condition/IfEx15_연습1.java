package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_연습1 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int game = ran.nextInt(100) + 1;
		//1~100
		
		if(game <= 30) {
			System.out.println("당첨!");
		}
		if(game > 30) {
			System.out.println("꽝");
		}
		
		
			
	}

}
