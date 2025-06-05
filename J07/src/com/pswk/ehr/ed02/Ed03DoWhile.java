/**
 * Ed03DoWhile.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed02;

import java.util.Scanner;

public class Ed03DoWhile {

	public static void main(String[] args) {
		// 1~100사이 숫자 맞추기!

		int input = 0;
		int answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		// 0.0 <= x < 1.0 -> 100
		// 0.0 <= x < 100.0 -> 정수로 변환
		// 0 <= x < 100 ->1 더하기
		// 1 <= x <101
		// System.out.println(answer);

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1~100사이 숫자를 입력하세요>");
			input = sc.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("더 큰 수를 입력하세요.");
			} // if end

		} while (input != answer);

		System.out.printf("정답은 answer: %d%n", answer);

	}

}
