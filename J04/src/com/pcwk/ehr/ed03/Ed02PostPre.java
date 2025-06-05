/**
 * 파일명: Ed01PostPre.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed03;

public class Ed02PostPre {

	public static void main(String[] args) {
		//전위 연산자
		
		int a = 14;
		int b = ++a; //a를 먼저 증가시키고, 그 값을 b에 대입
		
		System.out.printf("a = %d%n",a);
		System.out.printf("b = %d%n",b);
		
		System.out.println("===================");
		//후위 연산자
		a = 14;
		b = a++; //a의 현재 값을 먼저 b에 할당하고 이후 a를 증가
		
		System.out.printf("a = %d%n",a);
		System.out.printf("b = %d%n",b);
		
		
		
	}

}
