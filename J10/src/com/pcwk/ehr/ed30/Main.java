/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed30;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//리턴값이 없는 setgas()메서드 호출
		myCar.SetGas(5);
		
		//return 값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("가스를 주입하세요.");
	}

}
