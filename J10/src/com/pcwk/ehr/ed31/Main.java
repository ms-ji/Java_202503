/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed31;

public class Main {

	
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
		System.out.println(myCar.model);

	}

}
