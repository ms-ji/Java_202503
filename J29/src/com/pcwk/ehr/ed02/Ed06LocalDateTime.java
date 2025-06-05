/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed06LocalDateTime.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ed06LocalDateTime {

	public static void main(String[] args) {
		//현재 날짜, 시간
		LocalDate tody = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 날짜: "+tody.toString());
		System.out.println("현재 시간: "+nowTime);
		System.out.println("현재 날짜,시간: "+now);
		
		//포맷 지정 출력 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
		System.out.println("포맷 지정: "+formatter.format(now));
		
	}

}
