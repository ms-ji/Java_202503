package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Parant p = new Child();
		
		if(p instanceof Child) {
			Child c = (Child)p; // 다운 캐스팅(명시적 변환)
			c.childMethod();
		}else {
			System.out.println("다운캐스팅 불가능한 객체 입니다.");
		}
	
	}

}
