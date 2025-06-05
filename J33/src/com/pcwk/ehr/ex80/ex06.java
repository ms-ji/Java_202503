/**
 * Package Name : com.pcwk.ehr.ex80 <br/>
 * 파일명: ex06.java <br/>
*/
package com.pcwk.ehr.ex80;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ex06 {

	public static void main(String[] args) {
		String str = "2025-04-25 14:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date parsedDate;
		try {
			parsedDate = sdf.parse(str);
			System.out.println("파싱된 날짜: "+parsedDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}

	}

}
