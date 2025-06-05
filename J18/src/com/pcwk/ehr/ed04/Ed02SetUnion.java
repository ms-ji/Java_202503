/**
* 파일명:Ed01SetUnion.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ed02SetUnion {

	public static void displayAllSet(Set<String> set) {
		// HashSet 요소 전체 출력
		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {
			System.out.print(iter.next() + ",");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// String[] subjects = { "Java", "Oracle", "Html", "CSS", "Javascript",
		// "Spring", "Python", "Flask", "AI", "Java",
		// "Java" };
		Set<String> setA = new HashSet<>();
		setA.add("Java");
		setA.add("Oracle");
		setA.add("Spring");

		Set<String> setB = new HashSet<>();
		setB.add("Spring");
		setB.add("Python");
		setB.add("AI");

		displayAllSet(setA);
		displayAllSet(setB);

		Set<String> union = new HashSet<>(setA);
		union.addAll(setB);
		System.out.println("┌───────────────────────┐");
		System.out.println("│setA U setB            │");
		System.out.println("└───────────────────────┘");
		displayAllSet(union);
		
	
		
	}

}
