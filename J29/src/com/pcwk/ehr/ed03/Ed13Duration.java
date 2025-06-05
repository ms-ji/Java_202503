/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * Class Name: Ed13Duration.java <br/>
*/
package com.pcwk.ehr.ed03;

import java.time.Duration;
import java.time.LocalTime;

public class Ed13Duration {

	public static void main(String[] args) {
		// Duration 객체
		Duration Durationmin = Duration.ofMinutes(90); // 90분
		System.out.println("90분: " + Durationmin);// PT1H30M

		Duration Durationsec = Duration.ofSeconds(3600);// 3600초(1시간)
		System.out.println("360초: " + Durationsec);// PT1H

		// 두 시간 사이의 간격
		LocalTime start = LocalTime.of(9, 0); // 09:00
		LocalTime end = LocalTime.of(11, 30); // 11:30

		Duration between = Duration.between(start, end);
		System.out.println("09:00~11:30-> " + between);

		// 변환
		long hours = between.toHours();
		long minutes = between.toMinutes();

		System.out.println("시간: " + hours);
		System.out.println("분: " + minutes);

		// +연산
		Duration Added = between.plus(Duration.ofMinutes(30));
		System.out.println("+30분: " + Added);
		
		// -연산
		Duration minus = between.minus(Duration.ofMinutes(40));
		System.out.println("-40분: " + minus);
	}

}
