package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

// 2024-02-15 20;21~
/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4  -> 49
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_예시1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int ranNumber = ran.nextInt(101) + 150;
		System.out.println("랜덤 숫자는: " + ranNumber);
		
		int middleNumber = ranNumber % 100 / 10;
		System.out.println("정답은 : " + middleNumber);
	
		
		scan.close();
	}

}
