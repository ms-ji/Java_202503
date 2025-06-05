/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed03Lambda.java <br/>
*/
package com.pcwk.ehr.ed02;

public class Ed03Lambda {
	
	public static void main(String[] args) {
		// 익명 함수
		Runnable runnable = ()-> System.out.println("익명 함수");
						
						
		// 호출
		runnable.run();
	}

}
