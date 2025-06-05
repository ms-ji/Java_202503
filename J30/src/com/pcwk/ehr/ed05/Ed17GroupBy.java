/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed17GroupBy.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.util.*;
import java.util.stream.Collectors;
public class Ed17GroupBy {

	public static void main(String[] args) {
		//소문자 : 대문자로 변환 후 단축키(ctrl+shift+x)
		List<String> names = Arrays.asList("JAVA", "ORACLE", "HTML", "CSS"
				, "JAVASCRIPT", "SPRING", "PYTHON",
				"PYTHON FLASK", "ML");
		
		Map<Character,List<String>> grouped = names.stream()
		.collect(Collectors.groupingBy(word -> word.charAt(0)));
		
		System.out.println(grouped);

	}

}
