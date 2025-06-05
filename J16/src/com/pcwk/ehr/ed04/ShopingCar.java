/**
 * 파일명:ShopingCar.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed04;

//결제 시스템
public class ShopingCar {
	private PaymentsStrategy paymentsstrategy;
	
	//결제 방식(카드,payPal)
	public void setPaymentsstrategy(PaymentsStrategy paymentsstrategy) {
		this.paymentsstrategy = paymentsstrategy;
	}
	
	//결제 실행
	void checkout(int amount) {
		paymentsstrategy.pay(amount);
	}
	
}
