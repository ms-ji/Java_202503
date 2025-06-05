/**
 * Ed04Countinue.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed04;

public class Ed04Countinue {

	public static void main(String[] args) {
		// 1~10사이 홀수만 출력

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {// 짝수
				continue; //짝수일 때 건너뜀

			} //if end
			System.out.println(i);
		} //for end

	} //main end

}
