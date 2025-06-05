 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		BankAccount bankaccount = new BankAccount();
		
		Runnable task = () -> {
			for(int i =0;i<10;i++) {
			bankaccount.withdraw(Thread.currentThread().getName(),1000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//약간의 딜레이
			}
		};
		Thread t01 = new Thread(task,"이상무");
		Thread t02 = new Thread(task,"홍길동");
		Thread t03 = new Thread(task,"홍길동2");
		
		t01.start(); //스레드 시작
		t02.start(); 
		t03.start(); 
		
		t01.join(); //스레드가 끝날 때까지 기다리게 만드는 메서드
		t02.join();
		t03.join();
		
		System.out.println("최종 잔액: "+bankaccount.getBalance()+" 원");
		System.out.println("┌───────────────────────┐");
		System.out.println("│출금내역                   │");
		System.out.println("└───────────────────────┘");
		bankaccount.printHistory();
	}

}
