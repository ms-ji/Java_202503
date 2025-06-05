/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed11Predicate.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.*;
import java.util.function.Predicate;

public class Ed11Predicate {
	
	static void printIf(int num, Predicate<Integer>condition) {
		if(condition.test(num)==true) {
			System.out.println(num+ "은 조건을 만족 합니다.");
		}else {
			System.out.println(num+ "은 조건을 만족 하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		//입력 값 T를 받아서 true 혹은 false를 반환(조건식)
		printIf(7,x -> x%2 ==0);
		
	}

}
