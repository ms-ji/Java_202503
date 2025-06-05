/**
 * Ed01Example03.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed05;

public class Ed01Example03 {

	public static void main(String[] args) {
		// 1~100의 정수 중 3의 배수의 총합

		int sum = 0; //총합
		
		for (int i = 1; i <= 100; i++) {
			// System.out.println(i); 1~100까지 출력

			if (i % 3 == 0) {
				sum += i;//sum=sum+i
				//System.out.print(i+",");
				//System.out.println(sum);
			} // if end

		} // for end
		System.out.printf("합계:",sum);
	} // main end

}
