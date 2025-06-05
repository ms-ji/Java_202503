/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * Class Name: Ed03LowerBoundWildcard.java <br/>
*/
package com.pcwk.ehr.ed03;

import java.util.List;

public class Ed03LowerBoundWildcard {
	// 하한 제한 와일드카드는 특정 타입의 상위 클래스나 그 타입 자신을 허용함.
	// 즉, 하위 타입이 아닌 상위 타입을 제한 함.
	public static void addElements(List<? super Integer> list) {
		// list.add(1);
		// list.add(2);
	}

	public static void main(String[] args) {
		List<Number> numberlist = List.of(10, 20, 30);
		List<Object> objectlist = List.of(new Object(), new Object());

		// Integer나 그 상위 클래스
		addElements(numberlist);

		// 리스트에서 값을 읽을 때는 상위 타입으로만 읽어야 함.
		System.out.println(numberlist);
		System.out.println(objectlist);
	}

}
