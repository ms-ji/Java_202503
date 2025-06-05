package com.pcwk.ehr.ex80;

import java.util.Date;

public class ex01 {

	public static void main(String[] args) {
		Date now = new Date();
		Date earlierdate = new Date(0);
		
		System.out.println(now.toString());
		System.out.println(earlierdate.toString());
		
		System.out.println("이후인가?"+now.after(earlierdate));
		System.out.println("이전인가?"+now.before(earlierdate));
	}

}
