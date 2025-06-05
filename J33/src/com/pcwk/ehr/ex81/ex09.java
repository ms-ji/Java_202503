package com.pcwk.ehr.ex81;

import java.util.Arrays;
import java.util.List;

public class ex09 {

	public static void main(String[] args) {
		List<Integer>nums = Arrays.asList(1,2,3,4,5,6,7,8); //리스트 생성 및 저장
		System.out.println(nums);
		
		//리스트에서 짝수만 제곱해서 출력
		nums.stream().
		filter(n->n%2 == 0).
		map(n->n*n).
		forEach(System.out::println);
		
	}

}
