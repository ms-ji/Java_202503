/**
 * Package Name : com.pcwk.ehr.ex80 <br/>
 * 파일명: ex02.java <br/>
*/
package com.pcwk.ehr.ex80;

import java.util.Calendar;

public class ex02 {

	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("현재 연도: "+cal.get(Calendar.YEAR));
		System.out.println("현재 월: "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("현재 일: "+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 시간: "+ cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("현재 분: "+ cal.get(Calendar.MINUTE));
		System.out.println("현재 초: "+ cal.get(Calendar.SECOND));
		
	}

}
