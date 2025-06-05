/**
 * 파일명 : Ed05StringMethod.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed01;

public class Ed05StringMethod {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println("length: " + str.length()); // 4

		// charArt(index)
		System.out.println("charArt: " + str.charAt(0)); // J

		// substring(start, end): 특정 부분 반환
		str = "hamburger";
		System.out.println("substring(): " + str.substring(4, 8)); // urge
		System.out.println("substring(): " + str.substring(4)); // urger

		// indexOf : 특정 문자열의 위치
		str = "Java Programming";
		System.out.println("indexOf():" + str.indexOf("Pro")); // 5

		// replace(old,new)
		str = "java is fun";
		System.out.println(str.replace("java", "database")); //database is fun
		
		//split() : 문자열 나누기 
		str ="010-1234-5678";
		String[] num = str.split("-");
		
		//향상된 for
		for(String numB : num) {
			System.out.print(numB);
		}
		
	}

}
