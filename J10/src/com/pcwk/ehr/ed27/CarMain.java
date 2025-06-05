/**
 * 파일명 : CarMain.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed27;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car("자가용");
		System.out.println("company: "+car1.company);
		System.out.println("model: "+car1.model);
		System.out.println();
		
		Car car2 = new Car("자가용","검정");
		System.out.println("company: "+car2.company);
		System.out.println("model: "+car2.model);
		System.out.println("color: "+car2.color);
		System.out.println();
		
		Car car3 = new Car("자가용","검정",300);
		System.out.println("company: "+car3.company);
		System.out.println("model: "+car3.model);
		System.out.println("color: "+car3.color);
		System.out.println("maxSpeed: "+car3.maxSpeed);
		
		System.out.println();
	}

}
