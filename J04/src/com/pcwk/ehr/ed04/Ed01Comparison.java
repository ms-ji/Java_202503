/**
 * 파일명: Ed01Comparison.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed04;

public class Ed01Comparison {

	public static void main(String[] args) {
		//숫자형 비교
		int a =10;
		int b =20;
		
		System.out.printf("a==b: %b%n",(a==b));
		System.out.printf("a!=b: %b%n",(a!=b));
		
		//선택,alt +방향키 
		System.out.printf("a<b: %b%n",(a<b));
		System.out.printf("a>b: %b%n",(a>b));
		
		System.out.printf("a<=b: %b%n",(a<=b));
		System.out.printf("a>=b: %b%n",(a>=b));
		System.out.printf("---------------------\n");
		
		//문자형 비교
		char c1 ='A';
		char c2 ='B';
		
		System.out.printf("c1==c2: %b %n",(c1==c2));
		System.out.printf("c1<c2: %b %n",(c1<c2));
		System.out.printf("c1>c2: %b %n",(c1>c2));
		System.out.printf("---------------------\n");
		
		//논리값 비교
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.printf("b1==b2: %b%n",(b1==b2));
		System.out.printf("b1!=b2: %b%n",(b1!=b2));
		System.out.printf("---------------------\n");
		
		//객체 비교
		String str1 ="Java";		
		String str2 ="Java";
		String str3 = new String("Java");
		//객체 비교에서는 == 사용 금지(객체 주소 비교)
		System.out.printf("str1==str2: %b%n",(str1==str2));
		System.out.printf("str2==str3: %b%n",(str2==str3));
		
		//객체의 내용으로 비교(equals)
		System.out.printf("str2.equals(str3): %b%n",(str2.equals(str3)));
		System.out.printf("---------------------\n");
		
		//실수형은 2진수 근사값으로 저장
		float fValue = 0.1f;
		double dValue = 0.1;
		
		System.out.printf("0.1f==0.1 %b%n",(fValue==dValue));
		System.out.printf("fValue=%19.17f%n",fValue);
		System.out.printf("dValue=%19.17f%n",dValue);
		
	}

}
