/**
 * 파일명 : Ed01toString.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed02;

public class Ed01toString {

	String name;

	/**
	 * @param name
	 */
	public Ed01toString(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ed01toString) {
			Ed01toString other = (Ed01toString) obj;
			return this.name.equals(other.name); // 이름이 같으면 동일 객체로 간주
		}
		return false; // instanceof 조건에 해당하지 않으면 false 반환
	}

	/**
	 * @param name
	 */
	

	@Override
	public String toString() {
		return "Ed01toString [name=" + name + "]";
	}

}
