/**
* 파일명:Main.java<br/>
* 생성일:2025-04-01
*/
package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		// 인스턴스 생성1
		CustomeClass c1 = new CustomeClass();
		c1.displayInfo();
		c1.age = 22;
		c1.displayInfo();

		//// 인스턴스 생성2
		System.out.println("----------------");
		CustomeClass c2 = new CustomeClass();
		c2.displayInfo();
		c2.displayInfo(16);
		// 인스턴스 변수 접근

		// 인스턴스 생성3
		System.out.println("----------------");
		CustomeClass c3 = new CustomeClass("PCWK", 22);
		c3.displayInfo();

		System.out.println("----------------");
		// 클래스 메서드 호출
		CustomeClass.staticDispalyInfo();

		// 클래스 변수 호출
		System.out.println("CustomeClass.serialNo: " + CustomeClass.serialNo);
		CustomeClass.serialNo = 99;
		CustomeClass.staticDispalyInfo();
	}

}
