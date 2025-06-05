/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed08Supplier.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.function.Supplier;

public class Ed08Supplier {

	public static void main(String[] args) {
		
		Supplier<Double> random = ()->Math.random();
		//매개변수 없이 값을 반환하는 함수
		System.out.println("Supplier<Double>: "+random.get());

	}

}
