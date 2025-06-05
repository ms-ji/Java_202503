 /**
 * 파일명:BankAccount.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed02;

import java.util.Vector;

public class BankAccount {
	//필드 설정
	private int balance = 10_000; //잔고 
	private Vector<String>history = new Vector<>();
	
	//출금 : 음수가 되지 않게 확인
	//synchronized - 동기화 되지 않아 음수값을 띌 수 있다.
	public synchronized void withdraw(String name, int amount) {
		if(balance >= amount) {
			balance -=amount;
			history.add(name+"출금: "+amount+"원, 잔액: "+balance+"원");
		}else {
			history.add(name+"출금 실패(잔액 부족)");
		}
	}

	public int getBalance() {
		return balance;
	}
	public void printHistory() {
		for(String record :history) {
			System.out.println(record);
		}
	}

}
