/**
* 파일명:Ed01.java<br/>
* 생성일:2025-04-14
*/
package com.pcwk.ehr.ed03;

import java.util.*;

public class Ed01 {

	public static void main(String[] args) {
		// 성적 기준으로 내림차순 정렬 하시오.
		// "김철수":87, "이영희":92 ,"박민수":75
		Map<String, Integer> scores = Map.of("김철수", 87, "이영희", 92, "박민수", 75);

		for (String key : scores.keySet()) {
			System.out.printf(key + ":" + scores.get(key) + "\n");
		}
		System.out.println("---------------------");
		// hint
		// List로 변환
		List<Map.Entry<String, Integer>> list = new ArrayList<>(scores.entrySet());

		// sort()
		list.sort(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed());
		// list.sort((e1,e2)->Integer.compare(e2.getValue(),e1.getKey()));
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
