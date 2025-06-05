package com.pcwk.ehr.ex80;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex05 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss a");
		System.out.println("현재 날짜 "+sdf.format(now));
		
		//오늘이 올해의 몇번쨰 날인지
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println("올해의 몇번쨰 날: "+sdf.format(now));		
		
		
	}

}
