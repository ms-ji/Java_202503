/**
* 파일명:Member.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed03;

import java.util.Objects;

public class Member {
	private String userId; // 사용자_아이디
	private String name; // 이름
	private String password; // 비밀번호

	/**
	 * @param userId
	 * @param name
	 * @param password
	 */
	public Member(String userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	@Override
	public int hashCode() {
		return Objects.hash(name, password, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(userId, other.userId);
	}

}
