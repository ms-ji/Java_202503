/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed11ZoneDateTime.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ed11ZoneDateTime {

	public static void main(String[] args) {
		// 현재 날짜와 시간 + 시간대

		ZonedDateTime now = ZonedDateTime.now();
		System.out.println("현재 날짜와 시간 + 시간대: " + now);

		// 뉴욕 시간
		LocalDateTime ld = LocalDateTime.of(2025, 4, 29, 14, 48);
		ZonedDateTime specific = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간: " + specific);

		// 출력 포맷 지정
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		// z : 현재 시간의 타임존 약어(KST,PST,UTC,GMT 등)
		// W : 해당월의 주차(Week of Month)
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss z");

		String formattered = zoned.format(fomatter);
		System.out.println("포맷시간: " + formattered);
	}

}
