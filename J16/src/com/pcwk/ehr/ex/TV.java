/**
 * 파일명:TV.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex;

/**
 * 
 */
public class TV implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Remocon r =new TV();
		r.powerOn();

	}

}
