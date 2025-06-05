/**
* 파일명:Ed02FileInputStreamByteArray.java <br/>
* 생성일:2025-04-16
*/
package com.pcwk.ehr.ed02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ed02FileInputStreamByteArray {

	public static void main(String[] args) {

		// 본 파일을 읽음.
		String fileName = "D:\\JAP_20250317\\01_JAVA\\workplace\\J22\\src\\com\\pcwk\\ehr\\ed02\\Ed02FileInputStreamByteArray.java";
		try (InputStream fis = new FileInputStream(fileName)) {
			byte[] buffer = new byte[100];
			int byteRead;
			while ((byteRead = fis.read(buffer)) != -1) {
				// 읽은 바이트 수만큼 문자로 출력
				// System.out.print(byteRead);

				// 자기 자신을 읽어옴.
				System.out.print(new String(buffer, 0, byteRead));

				// StringIndexOutOfBoundsException -> byteRead보다 크기가 크면 오류
				// System.out.print(new String(buffer,0,byteRead+2));
			}

			System.out.println("파일 읽기 완료 !");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
