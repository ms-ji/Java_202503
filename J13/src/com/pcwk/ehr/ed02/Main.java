/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed02;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ed01toString p1 = new Ed01toString("홍길동");
		Ed01toString p2 = new Ed01toString("홍길동");
		
		System.out.println(p1.equals(p2));
	}
	
}
