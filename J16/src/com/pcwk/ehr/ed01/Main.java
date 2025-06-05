/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		implClass impl = new implClass();
		
		interfaceA interA = impl;
		interA.methodA();
		System.out.println("---------");
		
		interfaceB interB = impl;
		interB.methodA();
		interB.methodB();
		System.out.println("---------");
		
		interfaceC interC = impl;
		interC.methodA();
		interC.methodB();
		interC.methodC();
		
	}

}
