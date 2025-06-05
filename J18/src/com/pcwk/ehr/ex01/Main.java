 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex01;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Impl m = new Impl();
		m.methodA();
		m.methodB();
		m.methodC();
		System.out.println("=======");
		
		A a = m;
		a.methodA();
		System.out.println("=======");
		
		B b = m;
		b.methodA();
		b.methodB();
		System.out.println("=======");
		
		C c = m;
		c.methodA();
		c.methodB();
		c.methodC();
		System.out.println("=======");

	}

}
