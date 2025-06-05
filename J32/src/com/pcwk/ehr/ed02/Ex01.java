package com.pcwk.ehr.ed02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		Path path = Paths.get("example.txt");
		
		List<String>lines = Arrays.asList("오늘은 비오는 화요일","오늘은 금요일");
		
		try {
			Files.write(path,lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 작성 완료!");
	}
}
