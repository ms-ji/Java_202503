 /**
 * 파일명:Ed01Queue.java<br/>
 * 생성일:2025-04-14
 */
package com.pcwk.ehr.ed06;

import java.util.*;

public class Ed01Queue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		//요소 추가
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		//첫번째 요소 반환
		System.out.printf("첫번째 요소 반환: %s%n",queue.peek());
		
		//첫번째 요소 제거
		System.out.printf("첫번째 요소 제거: %s%n",queue.poll());
		System.out.println("전체요소: "+queue);
		
		//새로운 요소 추가
		queue.offer("딸기");
		System.out.println("전체요소: "+queue);
		
		//크기 확인
		System.out.println(queue.size());
		
		while(!queue.isEmpty()) {
			
			String fruits = queue.poll();
			System.out.println(fruits+",");
		}
		}
	}


