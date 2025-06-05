 /**
 * 파일명:MemberService.java<br/>
 * 생성일:2025-04-01
 */
package com.pcwk.ehr.ex1;

public class MemberService {
	String name;
	String id;
	String password;
	int age;
	
	
	

    boolean flag = false;

    // login method
    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
        	flag = true;
            
        }else {
        	flag = false;
        }
        return flag;
    }

    // logout method
    public void logout(String id) {
    	//id님은 로그아웃 되었습니다.
       System.out.printf("%s님은 로그아웃 되었습니다.%n",id);
    }
}
