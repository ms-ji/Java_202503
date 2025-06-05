/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed07LocalDate.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ed07LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		//임의 날짜 생성
		LocalDate customeDate = LocalDate.of(2025, 5, 2);
		
		//날짜 정보
		System.out.println("오늘: "+today);
		System.out.println("임의 날짜: "+customeDate);
		
		//날짜 가져오기.
		System.out.println("연도: "+customeDate.getYear());
		System.out.println("월: "+customeDate.getMonth());
		System.out.println("일: "+customeDate.getDayOfMonth());
		System.out.println("요일: "+customeDate.getDayOfWeek());
		
		//연산
		LocalDate nextDay = today.plusDays(3);
		System.out.println("3일 후: "+nextDay);
		
		//비교: 두 날짜를 비교
		System.out.println("customeDate가 오늘 이전인가? "+customeDate.isBefore(today));
		System.out.println("customeDate가 오늘 이후인가? "+customeDate.isAfter(today));
		
		//포맷팅
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		
		String formatteredDate = today.format(dtf);
		System.out.println(formatteredDate);
		
	}

}
