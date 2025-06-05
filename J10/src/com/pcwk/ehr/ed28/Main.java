/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed28;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 메서드 호출
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: "+result1);
		
		int x =10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		//리턴값이 없는 메서드 호출
		myCalc.powerOff();
	}

}
