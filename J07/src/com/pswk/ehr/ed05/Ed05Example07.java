/**
 * Ed05Example07.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed05;

import java.util.Scanner;

public class Ed05Example07 {

	public static void main(String[] args) {

		// 1.메뉴를 출력한다.
		//alt+shift+a
		
		int balance =0;//잔고
		String command =" ";
		
		do {
			Scanner sc =new Scanner(System.in);
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│ 1. 예금| 2.출금 | 3.잔고 |4.종료   │");
			System.out.println("└───────────────────────────────┘");
			
			System.out.print("선택>");
			command = sc.nextLine();
			
			switch(command) {
			case "1":
				System.out.print("예금액>");
				balance = sc.nextInt();
				break;
			case "2":
				System.out.print("출금액>");
				balance -= sc.nextInt();
				break;
			case "3":
				System.out.print("잔고>"+balance);
				break;
			case "4"://종료
				break;
				
			default:
				System.out.println("명령을 확인 하세요.");
				break;
			}
			System.out.println();
			} while(!"4".equals(command));
		System.out.println("프로그램 종료");
		}

}