 /** 
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: main.java <br/>
 */
package com.pcwk.ehr.ed03;


public class main {

	public static void main(String[] args) {
		Box<String> strbox = new Box<String>();
		strbox.setItem("Apple");
		String message = strbox.getItem();
		System.out.println(message);
		System.out.println("--------------------------");
		
		Box<Integer> intbox = new Box<>();
		intbox.setItem(22);
		//캐스팅이 필요 없다.
		int age = intbox.getItem();
	}

}
