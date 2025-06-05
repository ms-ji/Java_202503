/**
 * 파일명:Ed01BufferedWriter.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed06;

import java.io.*;
public class Ed01BufferedWriter {

	public static void main(String[] args) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("BufferedWriter.txt"));) {
			writer.write("Java 입출력 연습");//문자열 쓰기
			
			writer.newLine(); //os에 따른 줄바꿈.
			writer.write("BufferedWriter는 줄바꿈도 가능합니다.");
			writer.flush(); //버퍼 강제 출력
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");

	}

}
