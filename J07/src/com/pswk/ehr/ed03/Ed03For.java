/**
 * Ed03For.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed03;

public class Ed03For {

	public static void main(String[] args) {
		// for문에 초기화 식에는 float(부동 소수점) 사용 금지
		
		//float(부동 소수점)은 2진수로 변환시 소실이 발생
		//10회 반복이 예상됐지만 but 9회만 수행.
		for(float i =0.1f;i<=1.0f;i+=0.1f) {
			System.out.println(i);
		}
	}

}
