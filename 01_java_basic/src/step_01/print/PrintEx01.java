package step_01.print;  // 1)패키지 선언문은 '항상' 첫 줄에 작성한다.

// 2)주석 (comment) : 설명문 혹은 메모를 작성하기 위한 방법으로 프로그램의 실행에 영향 X
// 2-1) 라인(line) 주석 : 한줄 주석

/* 
 * 
 * 2-2 블록(block) 주석 : 여러줄 주석 
 * 
 *  a가
 *  b코드를 3개 수정했음
 *  
 *  
 *  3) 에디터 화면 확대 및 축소 : ctrl + [+] , ctrl + [-]
 *  
 *  
 *  4) 뒤로 되돌리기(redo)  : ctrl + z
 *    앞으로 되돌리기(undo) : ctrl + y
 * 
 * 
 *  5) 저장 : ctrl + s  ,  저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴. ( 항상 저장하는 습관 권장 )
 *  
 *  
 *  6) 출력문 자동완성
 *  
 *  	6-1) sysout + ctrl + space
 *  
 *  
 *  7) 유용한 단축키 
 *  
 * 		7-1) 복사    			  : ctrl + alt + 위 or 아래 방향키
 * 		7-2) 이동     			  : alt + 위 or 아래 방향키
 * 		7-3) 블록잡기 			  : shift + 위 or 아래 방향키
 * 		7-4) 삭제     			  : ctrl + d
 * 	    7-5) 단어 찾기 			  : ctrl + f
 * 	    7-6) 화면 최대화 & 최소화 : ctrl + m
 *      7-7) 코드 실행            : ctrl + f11
 *  
 * */


public class PrintEx01 {

	public static void main(String[] args) { //main함수의 {}안에서 프로그래밍
		
		//tab으로 들여쓰기
		
		// System.out.println(데이터); : 1)데이터를 화면에 출력 2) (개행)줄 바꿈
		System.out.println("===========");
		System.out.println(" 메뉴 선택 ");
		System.out.println("===========");
		
		// 출력데이터 없으면 줄바꿈 기능만 적용
	    System.out.println();
	    System.out.println();
		
		
		System.out.println("1) 로그인");
		System.out.println("2) 로그아웃");
		System.out.println("3) 종료(exit)");
		System.out.println();
		
		// System.out.print(데이터); : 1)데이터를 화면에 출력 
		System.out.print("- 상품 주문정보 [");
		System.out.print(" 가격 : 10000원 / ");
		System.out.print(" 할인율 : 10% / ");
		System.out.print(" 결제 금액 : 9000원 ]");
	    
		
	}

}
