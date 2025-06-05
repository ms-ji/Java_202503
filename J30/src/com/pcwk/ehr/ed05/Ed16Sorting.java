/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed16Sorting.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ed16Sorting {

	public static void main(String[] args) {
		
		//소문자 : 대문자로 변환 후 단축키(ctrl+shift+x)
		List<String> names = Arrays.asList("JAVA", "ORACLE", "HTML", "CSS"
				, "JAVASCRIPT", "SPRING", "PYTHON",
				"PYTHON FLASK", "ML");
		
		List<String> sorted = names.stream()
							.sorted()
							.collect(Collectors.toList());
		System.out.println(sorted);
	}

}
