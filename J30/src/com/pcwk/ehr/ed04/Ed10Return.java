/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed10Return.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.util.*;
import java.util.function.Function;

public class Ed10Return {
	
	 static Function<Integer, Integer> getMultiplier(int factor){
		return x -> x*factor;
	}
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> doubler = getMultiplier(5);
		System.out.println(doubler.apply(19)); //19*5 = 95
	}

}
