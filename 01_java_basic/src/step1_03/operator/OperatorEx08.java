package step1_03.operator;

/*
 * 2024-02-08 09:30 ~ 09:50
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장			+=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장   	%=
 *  6) 변수의 값에 1을 더한 후 저장	       	 	++
 *  7) 변수의 값에 1을 뺀 후 저장	        	--
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int salesVolume = 200;
		//salesVolume = salesVolume + 3;
		salesVolume += 3;
		System.out.println(salesVolume);
		
		int balance = 100000;
		balance = balance - 13000;
		balance -= 13000;
		System.out.println(balance);
		
		int totalPrice = 2000;
		totalPrice = totalPrice * 3;
		totalPrice *= 3;
		System.out.println(totalPrice);
		
		System.out.println();
		
		//(참고) 변수++과 ++변수 차이 : 명령어 실행순서 차이
		// 변수--, --변수
		
		int x = 0;
		//x = x + 1;
		//x += 1;
		x++;         //순서 영향 X
		
		System.out.println(x);
		
		++x;
		//x = x + 1;
		//x += 1;    //순서 영향 X
		System.out.println(x);
		System.out.println();
		
		
		int y = 0;
		System.out.println(y++); //sysout명령어 실행 후 y증가
		System.out.println(y);
		System.out.println();
		
		
		
		int z = 0;
		System.out.println(++z); //z 증가후 sysout 실행
		System.out.println(z);
	}

}




