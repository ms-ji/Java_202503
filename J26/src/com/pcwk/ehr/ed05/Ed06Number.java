/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed06Number.java <br/>
*/
package com.pcwk.ehr.ed05;


import java.lang.Integer;
import java.lang.Double;

public class Ed06Number {

	public static void main(String[] args) {
		//Integer 객체 생성
		Integer num = 100;
		
		//Number 클래스의 메서드
		System.out.println("byteValue: "+num.byteValue());
		System.out.println("intValue: "+num.intValue());
		System.out.println("longValue: "+num.longValue());
		System.out.println("floatValue: "+num.floatValue());
		System.out.println("doubleValue: "+num.doubleValue());
		
		//Double 객체 생성
		Double decimal = 123.45;
		System.out.println("intValue: "+decimal.intValue());
		System.out.println("floatValue: "+decimal.floatValue());
		
	}

}
