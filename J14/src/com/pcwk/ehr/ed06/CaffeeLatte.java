package com.pcwk.ehr.ed06;

public class CaffeeLatte extends Coffee {
	public CaffeeLatte() {
		super(2_500);
	}

	/**
	 * @param price
	 */
	@Override
	public String getName() {
		return "coffeeLatte";
	}
	
}
