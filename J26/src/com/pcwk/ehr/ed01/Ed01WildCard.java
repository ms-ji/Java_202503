package com.pcwk.ehr.ed01;

import java.util.List;

public class Ed01WildCard {
	// Unbounded Wildcard (?) : 제한이 없는 와일드 카드
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> stringList = List.of("A", "B", "C");
		List<Integer> intlist = List.of(1, 2, 3, 4, 5, 6, 7);

		// 두 타입 모두 처리 가능
		printList(stringList);
		printList(intlist);

	}

}
