package step1_05.condition;

import java.util.Scanner;

//2021-02-13 21:23~

/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.print("회원가입 id 입력 : ");
		int myId = scan.nextInt();
		
		System.out.print("회원가입 pw 입력 : ");
		int myPw = scan.nextInt();
		
		System.out.println("회원가입이 완료 되었습니다!");
		
		if (myId == dbId && myPw == dbPw) {
			System.out.println("로그인 성공");
		}
		
		if (myId != dbId && myPw != dbPw) {
			System.out.println("로그인 실패");
		}
		
	}

}
