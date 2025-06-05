/**
 * 파일명: Ed01LogialOperators.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed05;

public class Ed01LogialOperators {

	public static void main(String[] args) {
		int iValue = 6; //2와 3의 배수
		//int iValue = 4; 2의 배수
		
		
		//2 또는 3의 배수
		boolean result = (iValue%2 ==0);
		System.out.printf("result: %b%n",result);
		
		//3의 배수
		result = (iValue%3 == 0);
		System.out.printf("result: %b%n",result);
		
		//2 그리고 3의 배수
		result = ((iValue%2 ==0)&&(iValue%3 == 0));
		System.out.printf("result: %b%n",result);
		
		int charCode = 'A'; //A=65
		//대문자인지 확인하는 법 : ACSII 코드
		//대문자 A=65, Z=90
		System.out.printf("charCode: %d%n",charCode);
		
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자 입니다.");
			
		}
		//소문자 97 ~ 122
		if(charCode>=97 && charCode<=122) {
			System.out.println("소문자 입니다.");
			
		}
	}

}
