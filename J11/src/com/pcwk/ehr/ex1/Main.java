 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-01
 */
package com.pcwk.ehr.ex1;

public class Main {

	public static void main(String[] args) {
		MemberService member = new MemberService();
		boolean result = member.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout("hong");
			
		}else {
			System.out.println("id 또는 Password가 옳바르지 않습니다.");
			
		}
		

	}

}
