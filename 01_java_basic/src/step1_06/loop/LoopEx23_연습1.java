package step1_06.loop;

import java.util.Scanner;

//2024-02-19 19:07~

/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

public class LoopEx23_연습1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		
		int number = scan.nextInt();
		
		int cnt = 0;
		
		for (int i = 1 ; i <= number ; i++) {
			if (number % i == 0) {
				
				cnt++;
			}
		}
		
		if (cnt == 2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		
		scan.close();
	}

}
