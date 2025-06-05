/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed14StreamReduce.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.util.*;

public class Ed14StreamReduce {

	public static void main(String[] args) {
		int sum = List.of(1,2,3,4,5,6,7,8,9,10).stream()
		.reduce(0, (a, b) -> a + b);

		System.out.println("합계: " + sum);

	}

}
