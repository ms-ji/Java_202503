 /**
 * 파일명:Ed01ByteInputStream.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed01ByteInputStream {

	public static void main(String[] args) {
		//상대 경로
		//String filepath = "/J22/src/com/pcwk/ehr/ed02/byte_file.txt";
		
		//절대 경로
		String filepath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J22\\src\\com\\pcwk\\ehr\\ed02\\byte_file.txt";
		
		try(FileInputStream fis = new FileInputStream(filepath)){
			int data;
			while((data = fis.read())!= -1) {
				System.out.print((char)data);
			}
			System.out.println("파일 읽기 완료!");
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException: "+e.getMessage());
			e.fillInStackTrace();
		}catch(IOException e){
			System.out.println("IOException: "+e.getMessage());
			e.fillInStackTrace();
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
			e.fillInStackTrace();
	}

}
}
