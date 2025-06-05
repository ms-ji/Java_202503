package com.pcwk.ehr.ed01;

public class Ed03ThrowsCallStack {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
		methodA();
		}catch(Exception e) {
			System.out.println("main()에서 예외처리: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	//메서드
	public static void methodA() {
		System.out.println("methodA() 호출");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB() 호출");
		methodC();

	}
	public static void methodC() {
		System.out.println("methodB() 호출");
		
		//프로그래머 예외 발생
		throw new RuntimeException("예외 발생 위치:methodC");
	}
}
