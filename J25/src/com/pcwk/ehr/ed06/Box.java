 /** 
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * 파일명: Box.java <br/>
 */
package com.pcwk.ehr.ed06;

public class Box<T extends Comparable<T>> {
	private T data;

	/**
	 * @param data
	 */
	public Box(T data) {
		super();
		this.data = data;
	}

	public boolean isGreaterThen(T other) {
		int flag =  data.compareTo(other);
		System.out.println("flag:"+flag);
		//양수: data > other
		//음수 : data < other
		return flag>0;
	}
}
