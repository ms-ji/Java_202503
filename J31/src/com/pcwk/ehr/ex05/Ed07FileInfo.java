package com.pcwk.ehr.ex05;

import java.io.File;

public class Ed07FileInfo {

	public static void main(String[] args) {
		//File 객체로 읽기
		File file = new File("D:\\JAP_20250317\\01_JAVA\\workplace\\J31\\src\\com\\pcwk\\ehr\\ex05\\Ed07FileInfo.java");
		
		System.out.println("파일 이름: "+file.getName());
		System.out.println("파일의 절대 경로: "+file.getAbsolutePath());
		System.out.println("파일 크기: "+file.length());
		System.out.println("파일 존재 여부: "+file.exists());
		System.out.println("디렉토리 여부: " + file.isDirectory());
		System.out.println("파일 여부: " + file.isFile());
	}

}
