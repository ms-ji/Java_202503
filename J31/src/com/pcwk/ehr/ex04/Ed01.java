/**
 * Package Name : com.pcwk.ehr.ex04 <br/>
 * Class Name: Ed01.java <br/>
*/
package com.pcwk.ehr.ex04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ed01 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("printStream.txt");){
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
		}
		System.out.println("완료");
	}

}
