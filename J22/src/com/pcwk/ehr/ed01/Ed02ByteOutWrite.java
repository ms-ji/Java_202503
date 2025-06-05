 /**
 * 파일명:Ed02ByteOutWrite.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ed02ByteOutWrite {

	public static void main(String[] args) {
		
		//try-with-resources
		//try-with-resource 구문을 사용하려면, closeable이나 Autocloseable 인터페이스를 사용
		//구현한 객체는 try 블록이 끝날때 자동으로 자원을 반남.
		try (OutputStream fos = new FileOutputStream("Single_byte.txt");){
			
			fos.write(65); //ASCII 65 = 'A'
			fos.write(66); //ASCII 66 = 'B'
			fos.write(67);
			fos.write(68);
			
			fos.flush(); //내부 버퍼에 잔유하는 바이트를 출력하고 버퍼를 비움.
			//fos.close(); - 예외처리 하기 전에 종료됨으로 마지막에 사용한다. 
			
			System.out.println("단일 바이트 쓰기 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} 

	}

}
