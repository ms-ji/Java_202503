/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed15.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.util.*;
import java.util.stream.Collectors;

public class Ed15 {

	public static void main(String[] args) {
		//대문자 T로 시작하는 사람 찾기
		List<String> names = List.of("Tom","Jarry","Tim","Alice");
		
		List<String> filteredname = names.stream()
		.filter(n -> n.startsWith("T"))
		.collect(Collectors.toList());
		
		System.out.println(filteredname);

	}

}
