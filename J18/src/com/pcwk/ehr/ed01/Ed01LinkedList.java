/**
* 파일명:Ed01LinkedList.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed01;

import java.util.LinkedList;
import java.util.List;

public class Ed01LinkedList {
	
	//요소 전체 출력 함수
	static void dispalyAllLinkedList(List<String> linkedList) {	
		for (String subject : linkedList) {
			System.out.print(subject + ",");
		}
	}
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		// LinkedList<String> linkedList = new LinkedList<>();

		// 요소 추가
		linkedList.add("Java");
		linkedList.add("Oracle");
		linkedList.add("Html");
		linkedList.add("CSS");
		linkedList.add("Javascipt");
		linkedList.add("Spring");
		linkedList.add("Python");
		linkedList.add("Flask");
		linkedList.add("AI");

		// 모든 요소 출력
		for (String subject : linkedList) {
			System.out.print(subject + ",");
		}
		System.out.println("\n----------------------------");

		// 요소의 개수
		System.out.println("요소의 개수: " + linkedList.size());
		
		//특정 인덱스 요소 접근
		System.out.printf("다음 과정: %s%n",linkedList.get(1));
		
		//특정 요소 수정
		linkedList.set(7, new String("Fast API"));
		System.out.println("----------------------------");
		dispalyAllLinkedList(linkedList);
		System.out.println("\n----------------------------");
		
		//특정 요소 삭제
		//인덱스로 지우기
		System.out.println("삭제된 요소 입력: "+linkedList.remove(3));
		dispalyAllLinkedList(linkedList);
		
	}
	
}
