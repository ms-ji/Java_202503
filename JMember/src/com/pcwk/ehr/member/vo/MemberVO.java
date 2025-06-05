/**
 * Package Name : com.pcwk.ehr.member.vo <br/>
 * Class Name: MemberVO.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.member.vo;

import com.pcwk.ehr.cmn.DTO;

public class MemberVO extends DTO{

	private String	memberId ;    //회원ID	  
	private String	name     ;    //이름	      
	private String	password ;    //비밀번호	  
	private String	email    ;    //이메일	  
	private	int  	loginCount;   //로그인 횟수
	private String	regDt    ;    //가입일	  
	private String	role     ;    //권한	 
	/**
	 * @param memberId
	 * @param name
	 * @param password
	 * @param email
	 * @param loginCount
	 * @param regDt
	 * @param role
	 */
	public MemberVO(String memberId, String name, String password, String email, int loginCount, String regDt,
			String role) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.loginCount = loginCount;
		this.regDt = regDt;
		this.role = role;
	}
	/**
	 * 
	 */
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", loginCount=" + loginCount + ", regDt=" + regDt + ", role=" + role + ", toString()="
				+ super.toString() + "]";
	}
	   
	  
	
}
