/**
 * 파일명:MySqlDao.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex02;

public class MySqlDao implements DataAccessObject {
	private String name;
	
	/**
	 * 
	 */
	public MySqlDao() {
		super();
		name = "MySql";
	}

	@Override
	public void select() {
		System.out.println(name+"에서 DB를 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(name+"에서 DB를 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(name+"에서 DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(name+"에서 DB를 삭제");
		
	}

}
