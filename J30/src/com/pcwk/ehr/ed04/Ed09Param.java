/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed09Param.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.*;
import java.util.function.Function;

public class Ed09Param {

	// 함수를 파라미터로 전달
	public static String applyFunction(String input, Function<String, String> func) {
		return func.apply(input);
	}

	public static void main(String[] args) {
		// 입력 값 T를 받아서 결과 값 R을 반환하는 함수
		String result = applyFunction("hello", s -> s.toUpperCase());
		System.out.println("hello -> " + result);
	}

}
