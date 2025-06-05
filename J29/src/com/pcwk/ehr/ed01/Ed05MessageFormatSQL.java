/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed05MessageFormatSQL.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.text.*;

public class Ed05MessageFormatSQL {

	public static void main(String[] args) {
		//INSERT into member(member_Id,member_name) VALUES ('james01','이상무');
		//INSERT into {0}(member_Id,member_name) VALUES ('{1}','{2}');
		
		String tableName = "member";
		String member_Id = "james01";
		String member_name = "이상무";
		
		//SQL 포맷 작성
		String sqlFormat = "INSERT into {0}(member_Id,member_name) VALUES (''{1}'',''{2}'');";
		String formatredQuery = MessageFormat.format(sqlFormat, tableName,member_Id,member_name);
		
		System.out.println("SQL:\n+"+formatredQuery);

	}

}
