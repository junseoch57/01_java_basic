package step1_06.loop;

// 2024-02-15 21:26 ~ 
// 다시 풀어보기


//# 반복문 기본문제[2단계]

public class LoopEx03_연습1 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		
		int i = 1;
		
		while (i <= 10) {
			
			if (i >= 7 || i < 3) {
				
				System.out.print(" " + i);
			}
			i++;
			
		}
		
		System.out.println();
		
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		
		int sum = 0;
		
		while(i <= 10) {
			if (i >= 7 || i < 3) {
				
				sum += i; //sum = sum + i;
				
			}
			i++;  //해결필요
		}
		System.out.println("정답 : " + sum);
		
		
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		
		int cnt = 0;
		
		while (i <= 10) {
			
			if (i >= 7 || i < 3) {
				
				
				
			}
			
		}
		
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15

	
		
	}
	
}
