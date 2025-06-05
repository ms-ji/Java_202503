/**
 * 파일명:Ed02PrintStream.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed03;

import java.io.*;

public class Ed02PrintStream {

	public static void main(String[] args) {
		System.out.println("콘솔 출력");
		System.out.print("줄바꿈 없음");
		System.out.printf("나이: %d%n",22);
		System.err.println("에러");
		
		System.out.println("------------------");
	}

}
