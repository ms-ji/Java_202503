 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Calculrator calc = new Calculrator();
		
		System.out.println(calc.add(14, 16));
		System.out.println(calc.add(14, 16, 19));
		System.out.println(calc.add(14.0, 16.0));
		
	}

}
