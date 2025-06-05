/**
 * 파일명:Inner.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex04;

public class Inner {
	
	//바깥 멤머 msg
	private String msg = "즐화";
	
	
	class Innerinner{
		void display() {
			//msg 중첩 클래스에서 사용 가능
			System.out.println("내부 클래스:"+msg);
	}
	}
}
