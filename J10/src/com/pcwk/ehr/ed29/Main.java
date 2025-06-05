/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed29;

public class Main {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		
		int result1 = c1.sum(1,2,3);
		System.out.println("result1: " + result1);
		
		int result2 = c1.sum(1,2,3,4,5);
		System.out.println("result2: " + result2);
		
		int []values = {1,2,3,4,5};
		int result3 = c1.sum(values);
		System.out.println("result3: " + result3);
		
		int result4 = c1.sum(new int[] {1,2,3,4,5});
		System.out.println("result4: " + result4);
		
	}

}
