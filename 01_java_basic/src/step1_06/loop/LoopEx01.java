package step1_06.loop;
/*
 * 
 *  # 반복문 while
 *  
 *  [ 형식 ]
 *  
 *  초기식;
 *  while ( 조건식 ) {
 *  
 *  	조건식이 참일동안 실행할 명령어;
 *  	증감식;	
 *  
 *  }
 * 
 * 	- 반복문의 조건 3가지
 * 		1) 초기식 : 조건식을 false로 바꾸기 위한 초깃값 셋업
 * 		2) 조건식 : 조건판별
 * 		3) 증감식 : 조건식을 false로 바꾸기 위한 증가,감소
 * 
 * 
 * */
public class LoopEx01 {

	public static void main(String[] args) {
		
		int i = 0; //초기(init)식
		
		System.out.println("반복문 시작");
		
		while (i < 10) { // 조건식
			System.out.println("명령어");
			i++;   // 증감(증가감소)식    i = i + 1;  i += 1;
		}
		
		System.out.println("반복문 종료");
		
		
		
		
		
	}

}
