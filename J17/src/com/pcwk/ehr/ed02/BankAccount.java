package com.pcwk.ehr.ed02;

public class BankAccount {
	
	private double balance;//잔고

	/**
	 * @param balance
	 */
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	//출금
	public void withdraw(double amount)throws WithDrawException{
		if(balance < amount) {
			//잔액 부족시 예외 발생
			throw new WithDrawException("잔액이 부족합니다.\n잔액을 확인하세요.\n"+balance);
		}
		this.balance -= amount;
		
		System.out.println("출금 금액: "+amount);
		System.out.println("잔액: "+balance);
	}
		
}
