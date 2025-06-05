/**
 * 파일명: Ed02BigDemical.java <br/>
 * 작성자: user <br/>
 * 작성일: 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed04;

import java.math.BigDecimal;

public class Ed02BigDemical {

	public static void main(String[] args) {

		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.2");

		BigDecimal sum = a.add(b);
		System.out.println(sum.doubleValue());

	}

}
