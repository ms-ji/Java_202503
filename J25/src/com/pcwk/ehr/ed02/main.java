 /** 
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: main.java <br/>
 */
package com.pcwk.ehr.ed02;


public class main {

	public static void main(String[] args) {
		Box strbox = new Box();
		strbox.setItem("Apple");
		String message =(String)strbox.getItem();
		System.out.println(message);
		System.out.println("--------------------------");
		
		Box intbox = new Box();
		intbox.setItem(22);
		//사용할 때마다 캐스팅을 해야함.
		int age = (int) intbox.getItem();
	}

}
