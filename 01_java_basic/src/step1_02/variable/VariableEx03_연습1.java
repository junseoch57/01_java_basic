package step1_02.variable;

/*
 * 2024-02-08 20:22 ~ 20:
 * 느낀점 : 
 * 깨달은점 : 
 * 
 */

public class VariableEx03_연습1 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000;
		double taxRate = 3.3;
		System.out.println("세금 = " +salary * taxRate );
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int score1 = 100;
		int score2 = 88;
		int score3 = 92;
		
		double average = 0.0;
		
		System.out.println("평균 = " + (score1 + score2 + score3) / 3.0);
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int height = 7;
		int width = 3;
		double triArea = 0.0;
		
		System.out.println("넓이 = " + (width * height) / 2.0);
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		
		System.out.println("100초 = " + minutes + "분" + seconds + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 
		int money = 800;
		int coin500 = 0;
		int coin100 = 0;


	}

}
