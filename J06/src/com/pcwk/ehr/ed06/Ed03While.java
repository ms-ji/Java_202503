/**
 * 파일명 : Ed03While.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed06;

public class Ed03While {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (i <= 20) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum += i;
				System.out.printf("i=%d\tsum=%d%n",i,sum);
			}
			i++;

		} // while end
		System.out.printf("1~20까지 2또는 3의 배수의 합 : %d%n", sum);
	}//main end

}
