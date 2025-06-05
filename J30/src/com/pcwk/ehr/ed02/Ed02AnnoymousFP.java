/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed02AnnoymousFP.java <br/>
*/
package com.pcwk.ehr.ed02;

public class Ed02AnnoymousFP {

	public static void main(String[] args) {
		// 익명 함수
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명 함수");

			}

		};
		// 호출
		runnable.run();

	}

}
