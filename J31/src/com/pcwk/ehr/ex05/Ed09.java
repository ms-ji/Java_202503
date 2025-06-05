/**
 * Package Name : com.pcwk.ehr.ex05 <br/>
 * Class Name: Ed09.java <br/>
*/
package com.pcwk.ehr.ex05;

import java.io.*;

public class Ed09 {

	public static void exploreDirectory(File dir, int Depth) {
		String ident = " ".repeat(Depth);

		if (dir.isDirectory() == true) {
			System.out.println(ident + "[DIR]" + dir.getName());
			File[] files = dir.listFiles();

			if (null != files) {
				for (File file : files) {
					exploreDirectory(file, Depth + 1);
				}
			}
		} else {
			System.out.println(ident + "-파일: " + dir.getName());
		}
	}

	public static void main(String[] args) {
		File rootDir = new File("D:\\JAP_20250317\\01_JAVA\\workplace\\J31\\src");

		if (rootDir.exists() == true) {
			exploreDirectory(rootDir, 0);
		} else {
			System.out.println("지정한 경로가 존재하지 않습니다.");
		}

	}
}
