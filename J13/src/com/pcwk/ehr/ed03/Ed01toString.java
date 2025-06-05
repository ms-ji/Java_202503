/**
 * 파일명 : Ed01toString.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed03;

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
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Ed01toString [name=" + name + "]";
	}

}
