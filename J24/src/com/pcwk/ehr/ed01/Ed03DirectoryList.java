/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed03DirectoryList.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed01;

import java.io.File;

public class Ed03DirectoryList {

	public static void main(String[] args) {
		//D:\JAP_20250317\01_JAVA\workplace\J24\src\com\pcwk\ehr\ed01\Ed03DirectoryList.java
		String directoryPath  = "D:\\JAP_20250317\\01_JAVA\\workplace\\J24\\src\\com\\pcwk\\ehr\\ed01\\Ed03DirectoryList.java";
		File dir = new File(directoryPath);
		
		System.out.println("isDirectory:"+dir.isDirectory());
		System.out.println("exists:"+dir.exists());
		System.out.println("==================================");
		
		if (dir.exists() && dir.isDirectory()) {
			File [] files = dir.listFiles();
			
			for(File file : files) {
				System.out.println((file.isDirectory()?"<Dir>":"<File>")+file.getName());
			}
		}else {
			System.out.println("해당 디렉토리가 존재하지 않습니다.");
		}
	}

}
