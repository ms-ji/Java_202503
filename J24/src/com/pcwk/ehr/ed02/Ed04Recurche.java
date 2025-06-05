/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed04Recurche.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed02;

import java.io.File;

public class Ed04Recurche {

	// 함수 이름 : exploreDirectory(), paraml : File, int, return void
	/**
	 * 하부 디렉토리를 재귀호출에서 읽기
	 * 
	 * @param dir
	 * @param Depth
	 */
	public static void exploreDirectory(File dir, int Depth) {
		//들려 쓰기용 공백
		String ident = "  ".repeat(Depth);
		
		if (dir.isDirectory() == true) {
			//디렉토리면 
			System.out.println(ident+"[DIR] " + dir.getName());
			File[] files = dir.listFiles();

			if (null != files) {
				// 향상된 for문
				for (File file : files) {
					exploreDirectory(file, Depth+1);
				}
			}
			//디렉토리가 아니면
		} else {
			System.out.println(ident+"- 파일: " + dir.getName());
		}
		
	}

	public static void main(String[] args) {
		// D:\\JAP_20250317\\01_JAVA\\workplace\\J24\\src

		File rootDir = new File("D:\\JAP_20250317\\01_JAVA\\workplace");

		if (rootDir.exists() == true) {
			exploreDirectory(rootDir, 0);
		} else {
			System.out.println("지정한 경로가 존재하지 않습니다.");
		}
	}

}
