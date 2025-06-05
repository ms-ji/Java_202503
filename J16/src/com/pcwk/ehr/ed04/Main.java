/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		ShopingCar card = new ShopingCar();

		// 카드 결제
		card.setPaymentsstrategy(new CrefitCardPayMent());

		card.setPaymentsstrategy(new payPalpayment());
		card.checkout(3_000_000);

	}

}
