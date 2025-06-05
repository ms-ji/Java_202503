/**
 * 파일명:Ed01Stringspilt.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed07;

public class Ed01Stringspilt {

	public static void main(String[] args) {
		String csv = "Apple,Banana,Cherry";
		
		String[] fruits = csv.split(",");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		String repalced = csv.replace("Banana", "Oracle");
		System.out.println("replace: "+repalced);
	}

}
