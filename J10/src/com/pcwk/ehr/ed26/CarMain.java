/**
 * 파일명 : CarMain.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed26;

public class CarMain {

	public static void main(String[] args) {
		// 생성자 호출
		//1)
		Car c1 = new Car();
		System.out.println("제조회사: "+c1.company);
		
		//2)
		Car c2 = new Car("자가용");
		System.out.println("제조회사: "+c1.company);
		System.out.println("모델: "+c1.model);

	}

}
