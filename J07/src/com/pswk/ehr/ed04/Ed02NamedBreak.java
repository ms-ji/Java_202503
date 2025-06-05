/**
 * Ed02NamedBreak.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed04;

public class Ed02NamedBreak {

	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + ",");

			for (char num = '0'; num <= '9'; num++) {
				System.out.print(num);
				if (num == '3') {
					break;
				}
			} // for num end
			System.out.println();
		} // for ch end
	}// main end

}
