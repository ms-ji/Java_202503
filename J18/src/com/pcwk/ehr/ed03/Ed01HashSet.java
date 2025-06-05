/**
* 파일명:Ed01HashSet.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ed01HashSet {

	static void displayAllSet(Set<String> set) {
		// 요소 추가

		// HashSet 요소 전체 출력
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ",");

		}
	}

	public static void main(String[] args) {
		String[] subjects = { "Java", "Oracle", "Html", "CSS", "Javascript", "Spring", "Python", "Flask", "AI", "Java",
				"Java" };

		// HashSet
		Set<String> set = new HashSet<>();
		System.out.println("┌───────────────────────┐");
		System.out.println("│배열 요소(데이터 중복)        │");
		System.out.println("└───────────────────────┘");
		// 요소 추가
		for (String subject : subjects) {
			System.out.print(subject + ",");
			set.add(subject);
		}
		System.out.println("\n-------------");
		// 전체 요소 출력
		System.out.println("┌───────────────────────┐");
		System.out.println("│set 요소 출력             │");
		System.out.println("└───────────────────────┘");
		displayAllSet(set);
		System.out.println();
		// 요소 삭제
		set.remove("Java");
		System.out.println("┌───────────────────────┐");
		System.out.println("│set요소 삭제              │");
		System.out.println("└───────────────────────┘");
		displayAllSet(set);

	}

}
