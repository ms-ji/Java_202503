package com.pcwk.ehr.ex05;

import java.io.File;

public class Ed08Dir {

	public static void main(String[] args) {
		String DirPath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J31\\src\\com\\pcwk\\ehr\\ex05\\Ed08Dir.java";
		File dir = new File(DirPath);
		
		//디렉토리인지 여부를 반환
		System.out.println("isDirectory: "+dir.isDirectory());
		//파일, 디렉토리가 존재하는지 여부를 반환
		System.out.println("exists: "+dir.exists());
		
		if(dir.exists()&&dir.isDirectory()) {
			File[]files = dir.listFiles();
			
			for(File file : files) {
				System.out.println((file.isDirectory()?"<Dir>":"<File>")+file.getName());
			}
		}else {
			System.out.println("해당 디렉토리가 존재하지 않습니다.");
		}
	}

}
