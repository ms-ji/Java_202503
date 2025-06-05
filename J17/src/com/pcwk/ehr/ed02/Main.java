package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(50_000);
		System.out.println("-------------");
		System.out.println("프로그램 시작");
		System.out.println("-------------");
		try {
		account.withdraw(50_000*2);
		} catch (WithDrawException e) {
			System.out.println("WithDrawException:"+e.getMessage());
		}
		System.out.println("-------------");
		System.out.println("프로그램 종료");
		System.out.println("-------------");
	}

}
