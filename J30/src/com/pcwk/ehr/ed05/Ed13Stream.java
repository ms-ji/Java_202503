/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed13Stream.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.util.Arrays;
import java.util.List;

public class Ed13Stream {

	public static void main(String[] args) {
		// 문자열을 길이로 변환 후 평균 구하기
		List<String> words = Arrays.asList("Java", "Oracle", "html", "css", "JavaScript", "spring", "python",
				"python Flask", "ML");

		double avg = words.stream().mapToInt(String::length)// 문자열의 길이로 변환
				.average()// 평균
				.orElse(0);// 값이 null이면 0, 그렇지 않으면 해당 평균

		System.out.println("평균길이: " + avg);

	}

}
