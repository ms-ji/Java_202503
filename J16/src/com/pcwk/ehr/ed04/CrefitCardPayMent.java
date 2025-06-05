/**
 * 파일명:CrefitCardPayMent.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed04;

public class CrefitCardPayMent implements PaymentsStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("카드로 "+amount+"원 결제.");
	}

}
