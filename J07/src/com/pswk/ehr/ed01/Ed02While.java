/**
 * Ed02While.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed01;

public class Ed02While {

	public static void main(String[] args) {
		// 1+3+6+10+15+…(55) 의 총합 ⇒ 1+(1+2)+(1+2+3)…(1+2+3+..+10)

		int n = 1;
		int subtotal = 0; // 중간 합계
		int sum = 0;// 총합

		while (n <= 10) {
			subtotal = 0; // 중간 합계
			int i = 1;
			while (i <= n) {
				System.out.print(i + ",");
				subtotal += i;
				i++;
			}
			System.out.print(":" + subtotal);
			System.out.println();

			sum += subtotal;
			n++;
		} // while end
		System.out.printf("합계 총합은 %d이다.%n", sum);

	}

}
