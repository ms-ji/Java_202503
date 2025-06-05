 /**
 * 파일명:Ed02ArrayListVSLinkedList.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
public class Ed02ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		int size = 2_000_000;
		
		//ArrayList 성능측정
		//Returns the current time in milliseconds.
		long start01 = System.currentTimeMillis();
		for(int i =0;i<size;i++) {
			arrayList.add(i);
		}
		long end01 = System.currentTimeMillis();
		System.out.println("┌────────────────────────────┐");
		System.out.println("│ArrayList                   │");
		System.out.println("└────────────────────────────┘");
		System.out.printf("ArrayList Integer %d개 추가 경과 시간 %d(ms)%n",size,(end01-start01));
		
		//LinkedList 성능측정
		long start02 = System.currentTimeMillis();
		for(int i= 0;i<size;i++) {
			linkedList.add(i);
		}
		System.out.println("┌────────────────────────────┐");
		System.out.println("│LinkedList                  │");
		System.out.println("└────────────────────────────┘");
		long end02 = System.currentTimeMillis();
		System.out.printf("LinkedList Integer %d개 추가 경과 시간 %d(ms)%n",size,(end02-start02));
	}

}
