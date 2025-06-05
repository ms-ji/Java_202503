package com.pcwk.ehr.ed01;

public class Ed02_VarRage {

	public static void main(String[] args) {
		
		int v1 = 1;
		System.out.println("v1: " + v1);

		if (true) {
			int v2 = 2;
			System.out.println("v1: " + v1);
			if (true) {
				int v3 = 2;
				System.out.println("v1: " + v1);
				System.out.println("v2: " + v2);
				System.out.println("v3: " + v3);

			}
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			// System.out.println("v3: "+v3); v3 변수 범위 밖이므로 사용 불가
		}

		System.out.println("v1: " + v1);
		// System.out.println("v2: "+v2); v2 변수 범위 밖이므로 사용 불가

	}

}
