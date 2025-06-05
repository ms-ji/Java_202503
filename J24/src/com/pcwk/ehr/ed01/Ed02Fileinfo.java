/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed02Fileinfo.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed01;

import java.io.File;

public class Ed02Fileinfo {

	public static void main(String[] args) {
		//절대 경로
		//D:\JAP_20250317\01_JAVA\workplace\J24\src\com\pcwk\ehr\ed01\Ed02Fileinfo.java
		//상대 경로
		//String fileName = ".src\\com\\pcwk\\ehr\\ed01\\Ed02Fileinfo.java";
		//File file = new File(fileName);
		
		//File 객체로 읽기
		File file = new File(new File("D:\\JAP_20250317\\01_JAVA\\workplace\\J24\\src\\com\\pcwk\\ehr\\ed01\\Ed02Fileinfo.java"),"Ed02Fileinfo.java");
		
		System.out.println("파일 이름: " + file.getName());
		System.out.println("파일 절대 경로: " + file.getAbsolutePath());
		System.out.println("파일 크기: " + file.length());
		System.out.println("파일 존재 여부: " + file.exists());
		System.out.println("디렉토리 여부: " + file.isDirectory());
		System.out.println("파일 여부: " + file.isFile());
			

	}

}
