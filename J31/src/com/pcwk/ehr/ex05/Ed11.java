package com.pcwk.ehr.ex05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ed11 {
	
	public static int countForInFile(File file) {
		int count = 0;
		//파일 한 줄씩 읽기.
		try (BufferedReader reader = new BufferedReader(new FileReader(file));){
			String line;
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
				//for 단어 들어간 문장 찾기
				if(line.indexOf("if(")>-1||line.indexOf("if (")>-1) {
					count++;
					System.out.println(line);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return count;
	}
	public static int countForStatements(File dir) {
		int count = 0;
		File[]files = dir.listFiles();
		if(null==files)return 0;
		
		for(File file : files) {
			//디렉토리
			if(file.isDirectory()==true) {
				count +=countForStatements(file);
			}else if(file.getName().lastIndexOf("java")>-1) {
				count += countForInFile(file);
			}
		}
		return count;		
	}

	public static void main(String[] args) {
		String dirPath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J31";
		File footDir = new File(dirPath);
		if(!footDir.exists()) {
			System.out.println("경로가 존재하지 않습니다.");
			return;
		}
		int totalCount = countForStatements(footDir);
		System.out.println("전체 for문: "+totalCount);
	
	}

}
