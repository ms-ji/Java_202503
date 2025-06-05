/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed05SimpleDateFormat.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.util.*;
import java.text.*;
public class Ed05SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss a");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss a");
		System.out.println("현재 날짜 "+sdf.format(now));
		
		//오늘이 올해의 몇번째 날인지
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println("올해의 몇 번째 날 "+sdf.format(now));
	}

}
