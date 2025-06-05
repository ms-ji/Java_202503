/**
 * 파일명:Ed04.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed05;

public class Ed04 {

	public static void main(String[] args) {
		int[] member = { 14, 16, 19 };

		int idx = 5;

		try {
			int result = member[idx];

			// unchecked Exception
			// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
			e.printStackTrace();
		}

	}

}
