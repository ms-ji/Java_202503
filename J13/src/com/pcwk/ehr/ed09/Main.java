/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed09;

public class Main {

	public static void main(String[] args) {
		PrivateClass p =new PrivateClass();
		
		// p.show();not visible
		//System.out.println(p.num);not visible

		
		p.setNum(20);//setter를 통한 접근
		System.out.println(p.getNum());//getter를 통한 접근
	}

}
