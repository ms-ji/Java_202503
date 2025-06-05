/**
 * Ed07NestedFor.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed03;

public class Ed07NestedFor {

	public static void main(String[] args) {
		//구구단
		//1. for i -> 단
		//2. 	for j ->1~9
		
		for(int i =2;i<=9;i++) {
			System.out.printf("%d단%n",i);
			for(int j=1;j<=9;j++) {
				//2*1
				System.out.printf("%d * %d: %d%n",i,j,(i*j));
			}//for j end
			System.out.println();
		}//for i end

	}

}
