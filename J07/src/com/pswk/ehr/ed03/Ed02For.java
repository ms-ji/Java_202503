/**
 * Ed02For.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed03;

public class Ed02For {

	public static void main(String[] args) {
		//1~10까지 합
		
		int sum =0;
		for(int i =1;i<=10;i++) {
			
		sum+=i; 
		System.out.printf("%2d,sum: %2d%n",i,sum);
		
		}
		System.out.println("합계: "+sum);
	}

}
