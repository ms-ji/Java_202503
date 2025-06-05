/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "이상무";
		person.age = 22;
		
		//인스턴스 메서드
		person.sayHello();
		
		System.out.println("=================");
		//클래스 메서드 호출
		int result = Calc.add(22, 2);
		System.out.println("두 수의 합은 : "+result);
	}

}
