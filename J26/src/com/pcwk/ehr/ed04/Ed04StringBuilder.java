/**
 * Package Nme : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed04StringBuilder.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.lang.StringBuilder;

public class Ed04StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(200);

		// --단건등록
		sb.append("INSERT INTO board (  \n");
		sb.append("    seq,             \n");
		sb.append("    title,           \n");
		sb.append("    contents,        \n");
		sb.append("    read_cnt,        \n");
		sb.append("    reg_id,          \n");
		sb.append("    reg_dt,          \n");
		sb.append("    mod_id,          \n");
		sb.append("    mod_dt           \n");
		sb.append(" )VALUES (           \n");
		sb.append("    ?,               \n");
		sb.append("    ?,               \n");
		sb.append("    ?,               \n");
		sb.append("    ?,               \n");
		sb.append("    ?,               \n");
		sb.append("    SYSDATE,         \n");
		sb.append("    ?,               \n");
		sb.append("    SYSDATE          \n");
		sb.append("  )                  \n");

		// 문자열 삽입
		sb.insert(0, "게시글 등록\n");

		System.out.println(sb.toString());

		// 문자열 반전
		sb.reverse();
		System.out.println(sb.toString());

	}

}
