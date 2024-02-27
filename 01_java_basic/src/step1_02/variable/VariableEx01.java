package step1_02.variable;

/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */


public class VariableEx01 {

	public static void main(String[] args) {
	
		// 1. 정수 : Integer(int)		
		int salary; //변수 선언
		salary = 3000000;
		System.out.println(salary);
		
		
		// 2. 실수 : double
		double memberWeight = 80.12;
		System.out.println(memberWeight);
		
		
		// 3. 문자 1개 : character(char)
		char memberGenderEng = 'm';
		char memberGenderKor = '남';
		System.out.println(memberGenderEng);
		System.out.println(memberGenderKor);
		
		
		// 4. 문자열 : String
		String className = "web dev class";
		System.out.println(className);
		
		// 5. 참과 거짓 : boolean
		boolean isMember = true;
		System.out.println(isMember);
		
		// 변수의 특징 (고유성)
		
		int productPrice = 20000;
		//int productPrice = 200000; 같은 이름 변수 생성 X
		
		productPrice = 22000; //자료형(data type)을 생략했으므로 변수의 값 수정
		productPrice = 24000;
		
		System.out.println(productPrice);
		
		// 변수의 초깃(init)값
		
		//System.out.println(deliveryPrice); 변수를 초기화하지 않으면 가비지 데이터가 변수에 저장됨 
		
		int deliveryPrice = 0; //0데이터로 int형 변수 초깃값 대입
		
		// 초기화 예시
		double rate = 0.0;
		char agreeYn = 0;
		boolean isChecked = false;
		String account = null;
		
		
		
		
	}

}
