/**
 * Package Name : com.pcwk.ehr.ex80 <br/>
 * 파일명: ex03.java <br/>
*/
package com.pcwk.ehr.ex80;

import java.util.Calendar;

public class ex03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2025, Calendar.SEPTEMBER, 5);
		System.out.println("설정된 날짜: "+cal.getTime());
		
	}

}
