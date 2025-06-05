/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * Class Name: ex04.java <br/>
*/
package com.pcwk.ehr.ed06;

public class ex04 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("작업 스레드가 실행됩니다.");
			}
		});

		thread.start();
	}

}
