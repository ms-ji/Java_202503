package com.pcwk.ehr.ed04;

import java.util.*;

public class Ed01ArrayList {

	public static void main(String[] args) {
		//Resizable-array implementation of the List interface.
		//<스트링 클래스만 넣을 거야>
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("딸기");
		fruits.add("사과");	
		fruits.add("바나나");
		fruits.add("사과");//중복 허용
		
		System.out.println("전체 과일 목록: "+fruits);
		
		System.out.println("첫 번째 과일: "+fruits.get(0)); //첫 번째 과일: 딸기
		
		fruits.remove("바나나");
		System.out.println("바나나 삭제 후 전체 과일 목록:"+fruits);
		
		System.out.println("사이즈: "+fruits.size());
		
		System.out.println("포함 여부 확인(오렌지): "+fruits.contains("오렌지"));
		System.out.println("포함 여부 확인(딸기): "+fruits.contains("딸기"));
		
		System.out.println("------------------------------------");
		//젠체 순회
		
		for(int i = 0;i<fruits.size();i++) {
			//요소 : 1, 값 : 딸기
			System.out.printf("요소: %d, 값: %s%n",i,fruits.get(i));
		}
		//향상된 for문
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		fruits.set(2, "포도");
		System.out.println("사과를 포도로 치환 후 전체 과일 목록: "+fruits);
		
	}

}
