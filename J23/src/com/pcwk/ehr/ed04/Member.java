/**
 * 파일명:Member.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed04;

import java.io.Serializable;

public class Member implements Serializable{

	private static final long serialVersionUID = 1496292301125936006L;
	private String name;
	private int age; 
	/**
	 * @param name
	 * @param age
	 */
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name = "+name+", age = "+age+"]";
	}
	
}
