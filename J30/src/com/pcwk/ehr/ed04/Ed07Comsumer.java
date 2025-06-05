/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed07Comsumer.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.function.Consumer;

public class Ed07Comsumer {

	public static void main(String[] args) {
		Consumer<String> printMessage = message -> System.out.printf("message: %s%n",message);
		
		System.out.println("오늘은 즐거운 목요일");
	}

}
