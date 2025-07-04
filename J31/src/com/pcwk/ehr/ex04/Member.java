/**
 * Package Name : com.pcwk.ehr.ex04 <br/>
 * Class Name: Member.java <br/>
*/
package com.pcwk.ehr.ex04;

import java.io.Serializable;

public class Member implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7784669540722307382L;
	private String name;
	private int age; 
	
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
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}
