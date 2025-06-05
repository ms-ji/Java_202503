/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed30;

public class Car {

	// 필드 선언
	int gas;

	// 리턴값 없는 메소드
	void SetGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;

	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(가스 잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(가스 잔량: " + gas + ")");
				return; // 메서드 종료
			}
		}

	}
}