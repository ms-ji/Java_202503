package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Parant p = new Child();
		p.show(); // 자식 클래스 Show() 메서드
		Child c = (Child)p; // 다운 캐스팅(명시적 변환)
		c.childMethod();
		
		//ClassCastException
		//Parant p01 = new Parant();
		//Child c01 = (Child)p01;
		
		//c01.childMethod();
	}

}
