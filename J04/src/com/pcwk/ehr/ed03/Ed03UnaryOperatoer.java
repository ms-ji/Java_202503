/**
 * 파일명: Ed03UnaryOperatoer.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed03;

public class Ed03UnaryOperatoer {

	public static void main(String[] args) {
		//단항 연산자(unary Operator)는 하나의 피연산자(Operand)만을 대상으로 연산을 수행하는 연산자임.
		//Java에서는 숫자, 논리값, 변수 등에 적용할 수 있음.

		//부호 연산자
		int a =14;
		int b = -a; //부호 반전
		
		System.out.println("+a: "+(+a));
		System.out.println("-a: "+b);
		System.out.println("------------");
		
		//논리 부정 연산자(!)
		boolean flag = true;
		System.out.printf("falg = %b %n",flag);
		System.out.printf("!falg = %b %n",!flag);
		
		//비트 NOT 연산자(~): 피연산자의 모든 비트를 반전(0->1,1->0)함.
		int c = 5;//00000101(2진수)
		System.out.println("~c: "+(~c));//~c: -6 (음수로 변환 후 -1)
		System.out.println("------------");
		
		//형변환 연산자 :(타입)
		double d = 9.99;
		int i = (int) d; 
	
		System.out.println("정수로 변환 값: "+i); //정수로 변환: 9(손실 발생)
		
		
	}

}
