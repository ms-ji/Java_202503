/**
 * Ed01Break.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed04;

public class Ed01Break {

	public static void main(String[] args) {
		// 숫자 1부터 더해서 88이 언제 넘는지 출력하세요. 증가는 ++1

		int i = 0; // 증가
		int sum = 0; // 합계

		while (true) {

			if (sum >= 88) {
				break;
			} // if end
			++i;
			sum += i;

			System.out.printf("%d = %d%n", i, sum);

		} // while end

	}

}
