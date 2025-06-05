/**
 * Ed06NestedFor.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed03;

public class Ed06NestedFor {

	public static void main(String[] args) {

		
		for (int i = 5; i >= 1; i--) {
			
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			} // for i end
			System.out.println("*");
		} // for j end

	}// main end

}
