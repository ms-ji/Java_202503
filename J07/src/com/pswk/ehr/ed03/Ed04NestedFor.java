/**
 * Ed04NestedFor.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed03;

public class Ed04NestedFor {

	public static void main(String[] args) {
		// 단일 for문
		for(int i =1;i<=10;i++) {
			System.out.println("**********");
		}
		System.out.println("----------------");
		
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<10;j++) {
				System.out.print("*");
				
			}//for j end
			System.out.println("*");
		}//for i end

	}

}
