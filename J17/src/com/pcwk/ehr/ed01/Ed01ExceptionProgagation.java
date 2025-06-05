package com.pcwk.ehr.ed01;

public class Ed01ExceptionProgagation {
	public static void main(String[] args) {
		methodA(); //예외 처리가 되지 않으면 main까지 예외 전파됨.
	}
	
	static void methodA() {
		methodB(); //methodB 호출
	}
	static void methodB() {
		int x =5/0; //ArithmeticException발생
	}
}
