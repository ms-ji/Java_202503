/**
* 파일명:Ed01Stack.java<br/>
* 생성일:2025-04-14
*/
package com.pcwk.ehr.ed05;

import java.util.Stack;

public class Ed01Stack {

	public static void main(String[] args) {

		// Creates an empty Stack.
		Stack<Integer> stack = new Stack<Integer>();

		// push
		stack.push(14);
		stack.push(16);
		stack.push(19);

		// peek - 제거하지 않고 반환
		// pop - 제거하고 반환
		System.out.println("peek: " + stack.peek()); // 19
		// System.out.println("pop: "+stack.pop()); //19

		System.out.println("peek: " + stack.peek());// 16
		System.out.println("-----------------");
		// 반복문으로 꺼내기
		while (!stack.empty()) {
			System.out.println("pop: " + stack.pop());
		}

	}

}
