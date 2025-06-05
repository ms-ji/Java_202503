/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed04Calendar.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.util.Calendar;

public class Ed04Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("현재 날짜: "+cal.getTime());
		
		//10일 뒤 날짜 
		cal.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("10일 뒤 날짜: "+cal.getTime());
		
		//1개월 전
		cal.add(Calendar.MONTH, -1);
		System.out.println("1개월 전(월): "+cal.getTime());
	}

}
