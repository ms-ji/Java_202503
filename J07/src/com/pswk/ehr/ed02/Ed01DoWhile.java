/**
 * Ed01DoWhile.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed02;

import java.util.Scanner;

public class Ed01DoWhile {

	public static void main(String[] args) {
		// 메세지를 입력하세요. q를 입력하면 프로그램 종료.

		System.out.println("┌──────────────────────┐");
		System.out.println("│1.메세지를 입력 하세요.     ┃");
		System.out.println("│2.q를 입력시 프로그램 종료.  ┃");
		System.out.println("└──────────────────────┘");
		System.out.println("---------------------");
		System.out.println("---------------------");

		String inputMessage = ""; // 입력 메시지
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print(">");
			inputMessage = sc.nextLine();
			System.out.printf("입력 메시지: %s%n", inputMessage);
			System.out.println(inputMessage.equals("q"));

		} while (!inputMessage.equals("q"));

		System.out.println();
		System.out.println("┌──────────────────────┐");
		System.out.println("│Program end           ┃");
		System.out.println("└──────────────────────┘");
	}

}
