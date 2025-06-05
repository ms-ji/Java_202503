package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		MemberVO user = new MemberVO();
		
		//setter
		user.setMemberId("pcwk01");
		user.setName("홍길동⭐😘🍬");
		
		//getter
		System.out.println(user.getMemberId());
		System.out.println(user.getName());
		
		//toString
		System.out.println(user.toString());
	}

}
