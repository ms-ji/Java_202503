package com.pcwk.ehr.ed05;

import lombok.*;

@Data
@Getter
@Setter
//toString(). equals(), hashCode(),getter, setter
public class MemberVO {
	private String	memberId   ;//회원ID		
	private String	name       ;//이름			
	private String	password   ;//비밀번호		
	private String	email      ;//이메일		
	private int		loginCount ;//로그인 횟수	
	private String	regDt      ;//가입일		
	private String	role       ;//권한	
	
}
