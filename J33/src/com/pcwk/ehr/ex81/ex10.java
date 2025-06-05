package com.pcwk.ehr.ex81;

public class ex10 {

	public static void main(String[] args) {
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
