/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed09LocalDateTime.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ed09LocalDateTime {

	public static void main(String[] args) {
		//현재 날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: "+now);
		
		//특정 날짜와 시간
		LocalDateTime specificDateTime = LocalDateTime.of(2025, 9, 5, 17, 50,1);
		System.out.println("특정 날짜와 시간: "+specificDateTime);
		
		//날짜와 시간 정보 가져오기.
		System.out.println("연도: "+now.getYear());
		System.out.println("월: "+now.getMonth());
		System.out.println("일: "+now.getDayOfMonth());
		System.out.println("시간: "+now.getHour());
		
		//문자열 파싱 : 2025-09-05T17:50:01
		LocalDate parsedDateTime = LocalDate.parse("2025-09-05T17:50:01");
		System.out.println("문자열 파싱: "+parsedDateTime);
		
		//포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
		String formmated = now.format(formatter);
		System.out.println("포맷팅된 문자열: "+formmated);
	}

}
