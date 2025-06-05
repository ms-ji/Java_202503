package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(100_000); //10만원
		
		c.buycoffee(new Americano());
		c.buycoffee(new CaffeeLatte());
		System.out.println("현재 남은 돈: "+c.getMoney());
		System.out.println("적립금: "+c.getRewardPoints());
	}

}
