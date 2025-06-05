/**
 * 파일명 : Ed02whileOneToTenSum.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed06;

public class Ed02whileOneToTenSum {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (i <= 10) {
			sum += i;
			System.out.printf("i=%d,\tsum%d%n",i,sum);
			i++;
			
		} // while end
		System.out.println("sum: " + sum);
	}// main end

}
