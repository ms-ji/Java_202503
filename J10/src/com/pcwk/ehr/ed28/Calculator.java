/**
 * 파일명 : Calculator.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed28;

public class Calculator {
	//void 리턴값이 필요없는 메소드 타입
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	int plus (int x,int y) {
		int result =x+y;
		return result;
	}
	double divide(int x, int y) {
		double result =(double)x/(double)y;
		return result;
	}
}
