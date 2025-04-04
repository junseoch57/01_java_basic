package step1_02.variable;

/*
 * 
 *  # 변수 명명 규칙 (Naming Convention)
 * 
 *  1) 절대적 규칙
 * 
 * 	- 변수명에 숫자는 사용가능하나 숫자로 시작할 수 없다.
 *  - 변수명에 특수문자는 _ , $만 가능하다.
 *  - 변수명에 예약어(키워드)는 사용할 수 없다. ex) public , class , static
 *  - 변수명에 띄어쓰기를 사용 할 수 없다.
 *  - 변수명은 대소문자가 구분된다.
 * 
 *  2) 암묵적 규칙
 * 
 * 	- 변수명은 영어로 작성한다. ( 한글x ) 
 *  - 변수명은 소문자로 시작한다. ( 클래스이름을 대문자로 시작한다. )
 *  - 두 단어가 이어지는 경우 이어지는 단어의 첫글자를 대문자로 작성한다. (camel case)
 *    Ex) productCode , productName
 *  - 두 단어가 이어지는 경우 이어지는 단어를 _로 이어준다. (snake case)
 *    Ex) product_code , product_name
 *  
 *  - 상수명은 전부 대문자로 작성한다. (나중에 설명)
 *  - 상수명에서 두 단어가 이어지는 경우 _로 이어준다.
 *  
 *  - 불리언 변수명 앞에는 is를 붙인다. 
 *    Ex) isRunning , isChecked
 *    
 *  - '제 3자'가 보아도 변수안에 어떤데이터가 있는지 '직관적'으로 알 수 있도록
 *     변수명 작성에 마음과 정성을 들인다. ( 가장 중요 )
 *     
 *     Ex) a ( 절대 안됨 ) , v (절대 안됨) , productCode(o) , productName(o)
 *  
 * */

public class VariableEx02 {

	public static void main(String[] args) {
		
		
		//int num1 = 10;
		//int test_ = 10;
        
		
		//암묵적 규칙
		int 연휴기간 = 4; //변수명 영어로
		int Salary = 1; //변수명은 소문자로 시작
		
		int holidayPeriod = 4; // (이걸 써야함)
		
		int holiday_period = 4;
		
		boolean isAuthorized = false;
		
		int a = 10; //변수명은 제3자가 봐도 '직관적'으로 알 수 있도록
		
		
		
		
		
	}

}
