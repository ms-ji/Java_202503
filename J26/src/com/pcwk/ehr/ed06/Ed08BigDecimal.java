/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * Class Name: Ed08BigDecimal.java <br/>
*/
package com.pcwk.ehr.ed06;

import java.math.*;
public class Ed08BigDecimal {

	public static void main(String[] args) {
		BigDecimal price = new BigDecimal("19.99");
		BigDecimal quantity = new BigDecimal("3");
		
		BigDecimal total = price.multiply(quantity);
		BigDecimal average = total.divide(quantity,2,RoundingMode.HALF_UP);
		
		System.out.println("종합: "+total);
		System.out.println("평균: "+average);

	}

}
