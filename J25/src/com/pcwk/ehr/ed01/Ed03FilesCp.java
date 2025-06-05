/** 
* Package Name : com.pcwk.ehr.ed01 <br/>
* 파일명: Ed03FilesCp.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ed03FilesCp {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("example.txt");
		Path target = Paths.get("Copy_example.txt");

		// 파일 복사
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

		System.out.println("파일 복사 완료");
	}

}
