package com.pcwk.ehr.ed02;

public class Ex05 {

	public static void main(String[] args) {
		String str = "Hello, Java!";
		System.out.println("Original: "+str);
		System.out.println("길이: "+str.length());
		System.out.println("문자열 자르기: "+str.substring(7,11));
		System.out.println("포함여부: "+str.contains("java"));
	}

}
