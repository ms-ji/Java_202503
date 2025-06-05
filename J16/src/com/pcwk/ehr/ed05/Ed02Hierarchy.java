/**
 * 파일명:Ed02Hierarchy.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed05;

public class Ed02Hierarchy {

	public static void main(String[] args) {
		
		try {
		String str = null;
		
		System.out.println(str.length());
		} catch(NullPointerException e) {
			System.out.println("널 포인터 예외 발생!");
		}catch(Exception e) { //상위 버전을 먼저 하면 세부적인 에러를 잡을 수 없다.
			System.out.println("기타 예외 발생!");
		}
	}

}
