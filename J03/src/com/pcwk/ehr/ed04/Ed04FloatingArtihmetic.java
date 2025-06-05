/**
 * 
 */
package com.pcwk.ehr.ed04;

/**
 * 
 */
public class Ed04FloatingArtihmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		double b = 3;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("================");

		System.out.println("덧셈 : " + (a + b));
		System.out.println("뺄셈 : " + (a - b));
		System.out.println("곱하기 : " + (a * b));
		System.out.println("나눗셈 : " + (a / b)); //나눗셈 : 3.3333333333333335
		System.out.println("나머지 : " + (a % b));

	}

}
