/**
* 파일명:Ed03Image.java <br/>
* 생성일:2025-04-16
*/
package com.pcwk.ehr.ed02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ed05Buffered {

	public static void main(String[] args) {
		String orgImage = "D:\\JAP_20250317\\01_JAVA\\workplace\\J22\\image\\Spring.jpg";
		String saveImage = "newCopyArray.jpg";

		long start = System.currentTimeMillis();

		// byte[]
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(orgImage));
				BufferedInputStream bos = new BufferedInputStream(new FileInputStream(saveImage));) {
			byte[] data = new byte[1024];
			int len;

			while ((len = bis.read(data)) != -1) {
				//bos.write(data, 0, len);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간: " + (end - start) + "ms");
		System.out.println("ImageCoye 성공 !");
	}

}
