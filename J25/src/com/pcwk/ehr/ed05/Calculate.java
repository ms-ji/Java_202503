 /** 
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * 파일명: Calculate.java <br/>
 */
package com.pcwk.ehr.ed05;

public class Calculate {

	/**
	 * T는 Number 또는 그 하위 타입만 가능 : Integer,double,Long
	 * @param <T>
	 * @param a
	 * @param b
	 * @return double
	 */
	public static <T extends Number>double add(T a,T b){
		return a.doubleValue() + b.doubleValue();
	}
}
