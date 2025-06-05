/**
 * 파일명:payPalpayment.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed04;

public class payPalpayment implements PaymentsStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("payPal로 "+amount+"원 결제.");

	}

}
