/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed02DemicalFormat.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ed02DemicalFormat {

	public static void main(String[] args) throws ParseException {
		// df.parse("1,234.56"); //1234.56

		DecimalFormat df = new DecimalFormat("#,###.##");
		Number number = df.parse("1,234.56");
		System.out.println("1,234.56 > " + number.doubleValue());// 출력 : 1,234.56 > 1234.56

	}

}
