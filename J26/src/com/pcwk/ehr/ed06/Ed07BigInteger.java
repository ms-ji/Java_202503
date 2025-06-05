/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * Class Name: Ed07BigInteger.java <br/>
*/
package com.pcwk.ehr.ed06;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Ed07BigInteger {

	public static void main(String[] args) {
		// Long의 최대값
		System.out.println("최댓값: " + Long.MAX_VALUE);
		System.out.println("최솟값: " + Long.MIN_VALUE);

		long maxLong = 9223372036854775807L;
		System.out.println("오버플로우 발생: " + maxLong + 1);

		BigInteger bigNum01 = new BigInteger("9223372036854775807");
		BigInteger bigNum02 = new BigInteger("1000000000000000000");

		// 사칙 연산
		BigInteger resultAdd = bigNum01.add(bigNum02);
		BigInteger resultSubstract = bigNum01.subtract(bigNum02);
		BigInteger resultMultiply = bigNum01.multiply(bigNum02);
		BigInteger resultDivide = bigNum01.divide(bigNum02);

		System.out.println("더하기: " + resultAdd);
		System.out.println("빼기: " + resultSubstract);
		System.out.println("곱하기: " + resultMultiply);
		System.out.println("나누기: " + resultDivide);

	}

}
