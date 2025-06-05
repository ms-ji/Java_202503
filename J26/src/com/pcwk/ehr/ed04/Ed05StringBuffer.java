/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed05StringBuffer.java <br/>
*/
package com.pcwk.ehr.ed04;

public class Ed05StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("thead-safe");

		// 동기화된 문자열 추가
		synchronized (sb) {
			sb.append(" example");
		}
		System.out.println("StringBuffer: "+sb.toString());
	}

}
