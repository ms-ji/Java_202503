/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex02;

public class Main {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[]args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
