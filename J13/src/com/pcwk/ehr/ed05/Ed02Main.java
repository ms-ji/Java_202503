/**
 * 파일명 : Ed02Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed05;

import static java.lang.Math.abs;
import static java.lang.Math.PI;

public class Ed02Main {

	public static void main(String[] args) {
		//Math.abs() : 절대값
		int number = -99;
		System.out.println("Math.abs(): "+Math.abs(number));//99
		System.out.println("Math.PI: "+Math.PI);
		
		System.out.println("static import");
		System.out.println("---------------------");
		
		System.out.println("abs(): "+abs(number));//Math 생략 가능
		System.out.println("PI: "+PI);//Math 생략 가능
	}

}
