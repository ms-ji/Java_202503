/**
 * 파일명: OverflowEd01.java <br/>
 * 작성자: user <br/>
 * 작성일: 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed01;

/**
 * 
 */
public class OverflowEd01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxInt = 2_147_483_647;
		int overflow = maxInt + 2;

		System.out.println("overflow: " + overflow);

		int minInt = Integer.MIN_VALUE; // -2147483648
		int underflow = minInt - 1;
		System.out.println("underflow: " + underflow);
		
		
	}

}
