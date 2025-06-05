/**
 * Ed02Example04.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed05;

public class Ed02Example04 {

	public static void main(String[] args) {
		// while문, 주사위 합이 5
		// 1. 첫번째 주사위를 하나 굴린다.
		// 2. 두번째 주사위를 굴린다.
		// 3. 두 수를 더해 ==5 비교한다.
		// 4. 일치하면 프로그램 종료, 그렇지 않으면 주사위를 또 굴린다.

		while (true) {
			// 1.
			int firstDise = (int) (Math.random() * 6) + 1;
			// 2.
			int secondDise = (int) (Math.random() * 6) + 1;
			System.out.printf("주사위1:%d, 주사위2:%d%n", firstDise, secondDise);
			// 3.
			if (firstDise + secondDise == 5) {
				//4.
				System.out.printf("눈의 합이 5 입니다.");
				break;
			} //if end

		} // while end

	}

}
