package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed01ByteOutWrite {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("Single_byte.txt");
			fos.write(65); //ASCII 65 = 'A'
			fos.write(66);
			fos.write(67);
			fos.write(68);
			
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
		} finally {
			if (null != fos)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
