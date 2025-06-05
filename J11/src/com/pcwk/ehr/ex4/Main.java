 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01
 */
package com.pcwk.ehr.ex4;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+account.getBalance());
		System.out.println();
		
		account.setBalance(-1000);
		System.out.println("현재 잔고: "+account.getBalance());
		System.out.println();
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+account.getBalance());
		System.out.println();
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+account.getBalance());
		System.out.println();
	}

}
