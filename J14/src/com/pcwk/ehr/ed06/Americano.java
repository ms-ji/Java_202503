package com.pcwk.ehr.ed06;

public class Americano extends Coffee {
	
	public Americano() {
		super(1_900);
	}

	@Override
	public String toString() {
		return "Americano";
	}	
	@Override
	public String getName() {
		return "Americano";
	}
}
