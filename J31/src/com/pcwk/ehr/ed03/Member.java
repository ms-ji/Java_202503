package com.pcwk.ehr.ed03;

public class Member {
	private String name;
	private String job;
	/**
	 * @param name
	 * @param job
	 */
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", job=" + job + "]";
	}
	
}
