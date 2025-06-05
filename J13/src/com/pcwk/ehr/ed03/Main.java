/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed03;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ed01toString person01 = new Ed01toString("이상무");
		Ed01toString person02 = new Ed01toString("이상무");
		
		System.out.println(person01.hashCode()); //50646279
		System.out.println(person02.hashCode()); //50646279
	}

}
