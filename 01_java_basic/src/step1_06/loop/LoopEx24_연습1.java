package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

// 2021-02-19 19:14 ~ 
// 질문해야할듯
/*
 * 
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx24_연습1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int total = 0;
		double average = 0;
		int pass = 0;
		
		
		for (int i = 1 ; i <= 100 ; i++) {
			
			int grade = ran.nextInt(100) + 1;
			
			if (grade >= 60) {
				pass++;
			}
			
		}
		
		
	}

}
