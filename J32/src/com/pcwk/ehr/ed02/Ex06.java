package com.pcwk.ehr.ed02;

public class Ex06 {

	public static void main(String[] args) {
		String csv = "Apple,Banana,Cherry ";
		String [] fruits = csv.split(",");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		String replaced = csv.replace("Banana", "Oracle");
		String repeated = csv.repeat(3);
		
		System.out.println("대체: "+replaced);
		System.out.println("반복: "+repeated);
		
	}

}
