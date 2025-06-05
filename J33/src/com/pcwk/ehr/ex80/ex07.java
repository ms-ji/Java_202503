package com.pcwk.ehr.ex80;

import java.text.*;

public class ex07 {

	public static void main(String[] args) {
		double num = 12_345.6789;

		// 패턴 지정
		DecimalFormat df = new DecimalFormat("000,000.00");
		// 소숫점 2쨰 자리에서 반올림
		System.out.println("0,000.00: " + df.format(num));

		// 통화
		df = new DecimalFormat("\u00A4#,###.##");
		System.out.println("\\u00A4#.##: " + df.format(num));

		// $
		df = new DecimalFormat("$#,###.##");
		System.out.println("$#,###.##: " + df.format(num));
	}

}
