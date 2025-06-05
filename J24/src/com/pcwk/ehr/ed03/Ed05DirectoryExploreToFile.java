/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * Class Name: Ed05DirectoryExploreToFile.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ed05DirectoryExploreToFile {

	// exploreAndWriter() void
	public static void exploreAndWriter(File dir, int Depth, BufferedWriter writer) throws IOException {
		// 들려 쓰기용 공백
		String ident = "\t".repeat(Depth);// 문자만큼 반복해서 나옴(repeat)

		// 디렉토리와 파일 분리
		if (dir.isDirectory() == true) {
			// 디렉토리면
			writer.write(ident + "[DIR] " + dir.getName());
			writer.newLine(); //OS Line Skip
			File[] files = dir.listFiles();

			if (null != files) {
				// 향상된 for문
				for (File file : files) {
					exploreAndWriter(file, Depth + 1, writer);
				}
			}
			// 디렉토리가 아니면
		} else {
			writer.write(ident + "- 파일:" + dir.getName());
			writer.newLine();
		}

	}

	public static void main(String[] args) {
		// 탐색할 Root 디렉토리
		File footDir = new File("D:\\JAP_20250317\\01_JAVA\\workplace\\J24\\src");

		// 출력할 파일
		File outputFile = new File("directory_structure.txt");

		// txt -> char,buffered
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));) {
			if (footDir.exists() == true) {
				exploreAndWriter(footDir, 0, writer);
				System.out.println("탐색 결과가 저장되었습니다."+footDir.getAbsolutePath());
			} else {
				System.out.println("지정된 경로가 존재하지 않습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
