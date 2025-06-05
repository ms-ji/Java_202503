/**
 * 파일명 : Ed04String.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed01;

public class Ed04String {

	public static void main(String[] args) {
		String str01 = "java"; //String Pool
		String str02 = "java"; //같은 객체 참조

		String str03 = new String("java"); //새로운 객체 생성 -> Heap영역에 저장됨.
		
		System.out.printf("str01==str02 => %b%n",(str01==str02));
		System.out.printf("str02==str03 => %b%n",(str02==str03));
		
		System.out.printf("str02.equals(str03) => %b%n",(str02.equals(str03)));
		
	}

}
