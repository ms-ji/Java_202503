package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("hong","홍길동");
		
		System.out.println(member.id());
		System.out.println(member.name());
		
		//결과 값 동일
		System.out.println(member.toString());
		System.out.println(member);
		

	}

}
