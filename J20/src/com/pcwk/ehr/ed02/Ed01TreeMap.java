 /**
 * 파일명:Ed01TreeMap.java<br/>
 * 생성일:2025-04-14
 */
package com.pcwk.ehr.ed02;

import java.util.*;
import java.util.Map.Entry;


public class Ed01TreeMap {

	public static void main(String[] args) {
		//TreeMap생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Banana", 4000);
		treeMap.put("Apple", 2000);
		treeMap.put("Orange", 1200);
		treeMap.put("Mango", 3500);
		
		for(Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		//첫 번째 키와 마지막 키
		System.out.printf("첫 번째 키와 마지막 키: %s, %s%n",treeMap.firstKey(),treeMap.lastKey());
		
		//특정 Key로 Valeu접근
		System.out.printf("특정 Key로 Valeu접근 -> %s:%d %n ","Mango",treeMap.get("Mango"));
		
		//
	}

}
