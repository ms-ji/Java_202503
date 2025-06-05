package com.pcwk.ehr.ed01;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String>list = Arrays.asList("This is a java book"
											,"Lambda Expressions"
											,"Java8 supports lambda expresstions"
			
				);
		//String API
		//filter 중간 연산
		//forEach 최종연산
		list.stream()
		.filter(word -> word.toLowerCase().contains("java"))
		.forEach(s -> System.out.println(s));
	}

}
