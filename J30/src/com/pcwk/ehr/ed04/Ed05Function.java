/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed05Function.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.*;
import java.util.function.Function;

public class Ed05Function {

	public static void main(String[] args) {
		//Function<T,R>{R apply(T t);}
		//입력 값 T를 받아서 결과 값 R을 반환하는 함수
		Function<Integer, String> intToString = num -> "Number: "+num;
		
		System.out.println(intToString.apply(19));
		
		
	}

}
