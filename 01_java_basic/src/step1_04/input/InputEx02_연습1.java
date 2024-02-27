package step1_04.input;

import java.util.Scanner;

/*
 * 느낀점 : 
 * 
 * 
 */
//2024-02-13 20:23 ~ 
public class InputEx02_연습1 {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		int result = num1 + num2;
		System.out.println("숫자의 합 : " + result);
		
		System.out.println();
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자 1개 입력: ");
		int num3 = scan.nextInt();
		System.out.println(num3 % 2 == 1);
		
		System.out.println();
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적입력 : ");
		int grade = scan.nextInt();
		System.out.println(grade >= 60 && grade <= 100);
		
		
	}
	
}
