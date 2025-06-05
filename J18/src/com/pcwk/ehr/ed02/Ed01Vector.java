/**
* 파일명:Ed01Vector.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed02;

import java.util.*;

//ctrl+shift+o = import문 정리
//ctrl+shift+f = source 정렬
public class Ed01Vector {

	static void displayVector(Vector<String> vector) {
		// Vector 전체 내용 출력
		for (String element : vector) {
			System.out.printf(element + ",");
		}
		System.out.println();
		// Vector의 크기
		System.out.printf("capacity: %d%n", vector.capacity());

		// Vector 요소의 수
		System.out.printf("size: %d%n", vector.size());
	}

	public static void main(String[] args) {
		// Vector 생성
		Vector<String> vector = new Vector<>(5);

		displayVector(vector);
		System.out.println("-------------------");

		// 요소 추가
		vector.add("Java");
		vector.add("Oracle");
		vector.add("Html");
		vector.add("CSS");
		vector.add("Javascipt");
		vector.add("Spring");
		vector.add("Python");
		vector.add("Flask");
		vector.add("AI");
	
		//요소 사이즈와 capacity 동일하게 하기
		vector.trimToSize();
		displayVector(vector);
		System.out.println("-------------------");
		
		
		//Vector 요소 삭제
		vector.remove(3);
		vector.trimToSize();
		displayVector(vector);
	}

}
