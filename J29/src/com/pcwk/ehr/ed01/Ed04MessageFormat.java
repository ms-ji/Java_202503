/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed04MessageFormat.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.text.MessageFormat;
import java.util.Date;

public class Ed04MessageFormat {

	public static void main(String[] args) {
		String pattern = "날짜: {0,date,yyyy-mm-dd},시간: {0,time}, 금액: {1,number,currency}";

		Object[] arguments = { new Date(), 123456789 };

		String result = MessageFormat.format(pattern, arguments);
		// 출력은 시스템 로케일(locale) 설정에 따라 달라질 수 있음.
		System.out.println(result);
		// 출력 : 날짜: 2025-11-29,시간: 오전 10:11:22, 금액: ₩123,456,789

	}

}
