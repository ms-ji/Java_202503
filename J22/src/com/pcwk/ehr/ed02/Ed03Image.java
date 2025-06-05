 /**
 * 파일명:Ed03Image.java <br/>
 * 생성일:2025-04-16
 */
package com.pcwk.ehr.ed02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ed03Image {

	public static void main(String[] args) {
		String orgImage ="D:\\JAP_20250317\\01_JAVA\\workplace\\J22\\image\\Spring.jpg";
		String saveImage = "newCopyFlow.jpg";
		
		long start = System.currentTimeMillis();
		
		try (FileInputStream fis = new FileInputStream(orgImage);
				FileOutputStream fos = new FileOutputStream(saveImage);) {
			int data;

			while ((data = fis.read()) != -1) {
				// System.out.print(data);
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("경과시간:" + (end - start) + "ms");//출력: 경과시간:408ms
		System.out.println("ImageCopy 성공!");
	}

}
