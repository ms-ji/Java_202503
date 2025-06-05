/**
 * 파일명:Ex03.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed02;

public class Ex03 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum +=j;
			}		
		}	
		System.out.println("3번답안: "+sum);
	}

}
