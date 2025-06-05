/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		System.out.println("**커피 만들기**");
		Beverage coffee = new Coffee();
		
		coffee.prepareRecipe();
		System.out.println("==============");
		
		System.out.println("**차 만들기**");
		Beverage tee = new Tee();
		tee.prepareRecipe();
	}

}
