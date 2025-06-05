 /**
 * 파일명:Ed02.java<br/>
 * 생성일:2025-04-14
 */
package com.pcwk.ehr.ed03;

import java.util.Map;
import java.util.TreeMap;

public class Ed02 {

	public static void main(String[] args) {
		//문자에서 단어의 등장 횟수를 세고, 등장 횟수 기준으로 내림차순 정렬해 출력 하세요.
		//"hello world hello java hello tree"
			
		//1. 단어 분리 스페이스 기준으로 분리
		//2. 단어를 맵에 담는다.count++
		//3. List 변환 후 내림차순 정렬
		
		String input = "hello world hello java hello tree";
		String []words = input.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
		
		Map<String,Integer> map = new TreeMap<>();
		for(String word : words) {
			
			//if(map.containsKey(word)==true) {
			//	map.put(word, map.get(word)+1);
			//}else {
			//	map.put(word,1);
			//}
			map.put(word, map.getOrDefault(word, 0)+1);
		}   
		System.out.println(map);
	}

}

	