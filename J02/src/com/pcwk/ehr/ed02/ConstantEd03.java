package com.pcwk.ehr.ed02;

public class ConstantEd03 {

	static final double DISCOUNT_RATE = 0.1; // 할인율 10%

	public static void main(String[] args) {
		double originalPrice = 1000;
		// 10% 할인 -> 90% 지급
		double discountPrice = originalPrice * (1 - DISCOUNT_RATE);

		System.out.print("DISCOUNT_RATE : " + DISCOUNT_RATE);
		System.out.println("discountPrice : " + discountPrice);
		System.out.println("originalPrice :" + originalPrice);

	}

}
