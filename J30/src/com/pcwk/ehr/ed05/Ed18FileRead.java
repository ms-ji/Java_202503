/**
 * Package Name : com.pcwk.ehr.ed05 <br/>
 * Class Name: Ed18FileRead.java <br/>
*/
package com.pcwk.ehr.ed05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ed18FileRead {

	public static void main(String[] args) {
		String filePath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J30\\src\\com\\pcwk\\ehr\\ed05\\Ed18FileRead.java";
		Path path = Paths.get(filePath);

		try {
			Files.lines(path).filter(line -> !line.isBlank()) // if
					.map(String::toUpperCase)// 변환
					.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
