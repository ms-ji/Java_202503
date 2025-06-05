package com.pcwk.ehr.ed06;

public class Coffee {
	
	private int price; //커피가격
	private int bonusPoint; //적립금
	
	public Coffee(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(price/10.0); //10%적립
		
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getName() {
		return "일반 커피";
	}
}
