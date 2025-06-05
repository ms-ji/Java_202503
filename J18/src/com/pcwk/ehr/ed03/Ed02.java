/**
* 파일명:Ed02.java<br/>
* 생성일:2025-04-10
*/
package com.pcwk.ehr.ed03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ed02 {
	
	static void displayAllSet(Set<Integer> set) {
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {//데이터가 있으면 true
			System.out.print(iter.next()+",");
		}
		System.out.println();
	}
	
	public static void main(String[]args) {
		//1~45 중복 제거 6개 숫자 출력
		
		Set<Integer>lotto = new HashSet<>();
		
		while(lotto.size()<6) {
			int num =(int)(Math.random()*45)+1;
			lotto.add(num);
			
			lotto.iterator();
		}
		displayAllSet(lotto);
	}
}
