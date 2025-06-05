/**
 * 파일명:Ed01PrintStream.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ed01PrintStream {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("printStream.txt");) {
			PrintStream ps = new PrintStream(fos);

			ps.print("오늘은 즐거운 금요일");
			ps.println("프린터가 출력하는 것처럼 ");
			ps.println("데이터를 출력합니다.");
			ps.printf("|%7d|%-12s|%10s %n", 1,"홍길동","의적");
			ps.printf("|%7d|%-12s|%10s %n", 2,"이상무","학생");
			
			ps.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");
	}

}
