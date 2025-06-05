package com.pcwk.ehr.ed07;

import com.pcwk.ehr.ed06.Americano;
import com.pcwk.ehr.ed06.CaffeeLatte;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(100_000); //10만원
		
		c.buycoffee(new Americano());
		c.buycoffee(new Americano());
		c.buycoffee(new Americano()); //1900
		c.buycoffee(new CaffeeLatte());
		c.buycoffee(new CaffeeLatte());//2500
		
		c.summary();
		
		System.out.println("현재 남은 돈: "+c.getMoney());
		System.out.println("적립금: "+c.getRewardPoints());
	}

}
