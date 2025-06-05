package com.pcwk.ehr.ex80;

import java.text.*;

public class ex08 {

	public static void main(String[] args) throws ParseException {
		DecimalFormat df = new DecimalFormat("#,###.##");
		Number number = df.parse("1,234.56");
		System.out.println(number.doubleValue());//숫자로 변환
		System.out.println(df.format(number));//문자열
		
	}

}
