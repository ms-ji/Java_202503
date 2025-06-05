/**
 * 파일명:OracleDao.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex02;

public class OracleDao implements DataAccessObject {
	private String name;
	/**
	 * 
	 */
	public OracleDao() {
		super();
		name = "Oracle";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void select() {
		System.out.println(name+"에서 DB를 검색");

	}

	@Override
	public void insert() {
		System.out.println(name +"에서 DB를 삽입");

	}

	@Override
	public void update() {
		System.out.println(name+ "에서 DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println(name+ "에서 DB를 삭제");

	}

}
