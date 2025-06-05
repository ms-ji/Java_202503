/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed01DecimalFormat.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.text.DecimalFormat;

public class Ed01DecimalFormat {

	public static void main(String[] args) {
		double num = 12_345.6789;

		// 패턴 지정 : 000,000.00
		DecimalFormat df = new DecimalFormat("000,000.00");
		// 소숫점 2째 자리에서 반올림
		System.out.println("0,000.00: " + df.format(num));

		// 패턴 지정 : ###,###.##(사용 빈도가 높음)
		df = new DecimalFormat("###,###.##");
		// 소숫점 2째 자리에서 반올림
		System.out.println("###,###.##: " + df.format(num));

		// 통화 : \u00A4#,###.##
		df = new DecimalFormat("\u00A4#,###.##");
		// ₩12,345.68
		System.out.println("\\u00A4#,###.##: " + df.format(num));

		// $
		df = new DecimalFormat("$#,###.##");
		System.out.println("$#,###.##: " + df.format(num));

	}

}
