package step1_05.condition;

import java.util.Scanner;

// 2024-02-14 20:15~

/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */



public class IfEx10_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;

		System.out.println("id를 입력 : ");
		int myId = scan.nextInt();
		
		if (myId == dbId) {
			System.out.println("pw를 입력 : ");
			int myPw = scan.nextInt();
					
			if (myPw == dbPw) {
				System.out.println("로그인 성공");
			}
			if (myPw != dbPw) {
				System.out.println("pw를 확인해주세요");
			}
			
		}
		
		if (myId != dbId) {
			System.out.println("id를 확인해주세요 : ");
		}
		scan.close();
	}

}
