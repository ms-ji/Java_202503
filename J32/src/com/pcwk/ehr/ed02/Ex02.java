package com.pcwk.ehr.ed02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		Path path = Paths.get("example.txt");
		List<String> lines;
		try {
			lines = Files.readAllLines(path);
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
