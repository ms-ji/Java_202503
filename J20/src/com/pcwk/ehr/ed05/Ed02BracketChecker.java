/**
* 파일명:Ed02BracketChecker.java<br/>
* 생성일:2025-04-14
*/
package com.pcwk.ehr.ed05;

import java.util.Stack;

public class Ed02BracketChecker {

	public static boolean isBalance(String input) {

		Stack<Character> stack = new Stack<Character>();
		// 문자열을 char 배열로 변환
		
		//여는 괄호가 있으면 stack에 저장
		for (char ch : input.toCharArray()) {
			// System.out.println(ch);
			// {,[,( 있으면 스택에 넣는다.
			// ),],} 있으면 스택에서 꺼낸다.
			
			
			if (ch == '('||ch == '{' ||ch == '[') {
				stack.push(ch);
				//닫는 괄호일 경우 스택에서 확인
			} else if (ch == ')'
						||ch == '}'
						||ch == ']') {
				//스택이 비어있으면 괄호 짝이 맞지 않음.
				if (stack.isEmpty()==true ) return false;
				
				char open = stack.pop();
				
				// 닫는 괄호 && 여는 괄호가 아니면 false
				if ((open != '('&& ch == ')')
						||(open != '{'&& ch == '}')
						||(open != '['&& ch == ']')) {
					return false;
				}
			}
		}
		// stack
		return stack.isEmpty();
	}



	public static void main(String[] args) {
		String input = "[{()}]";

		System.out.printf("입력: %s%n", input);
		System.out.println(isBalance(input)?"정상":"비정상");
		
	}

}
