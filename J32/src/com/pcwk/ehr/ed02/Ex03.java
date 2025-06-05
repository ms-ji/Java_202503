package com.pcwk.ehr.ed02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("example.txt");
		Path target = Paths.get("Copy.txt");
		
		//파일 복사
		Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("완료");

	}

}
