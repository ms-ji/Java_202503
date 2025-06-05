/** 
* Package Name : com.pcwk.ehr.ed01 <br/>
* 파일명: Ed02Files.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ed02Files {

	public static void main(String[] args) {
		Path path = Paths.get("example.txt");

		try {
			//파일 읽기
			List<String> lines = Files.readAllLines(path);

			for (String line : lines) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
