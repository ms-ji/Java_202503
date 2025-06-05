/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed08LocalTime.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ed08LocalTime {

	public static void main(String[] args) {
		//현재 시간
		LocalTime now = LocalTime.now();
		System.out.println("현재 시간: "+now);
		
		//특정 시간
		LocalTime specifictime = LocalTime.of(11, 50, 01);
		System.out.println("특정 시간: "+specifictime);
		
		//문자열에서 시간을 파싱
		LocalTime parsedTime = LocalTime.parse("11:50:01");
		System.out.println("파싱된 시간: "+parsedTime);
		
		//시간 정보 가져오기
		System.out.println("시: "+now.getHour());
		System.out.println("분: "+now.getMinute());
		System.out.println("초: "+now.getSecond());
		System.out.println("나노초: "+now.getNano());
		
		//포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
		String formatterTime = now.format(formatter);
		System.out.println("포맷 현재 시간: "+formatterTime);
		
	}

}
