package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		Parant p = new Child(); // 업캐스팅

		p.show(); // 자식 클래스의 show() 메서드

		// p.childMethod(); 오류 발생(child 메서드 사용 불가)
	}

}
