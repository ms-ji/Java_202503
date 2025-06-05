/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: Ed6CountFor.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed04;

import java.io.*;

public class Ed6CountFor {
	
	//countForInFile(),return int,param1 : File file
	//파일에서 for문 읽기
	public static int countForInFile(File file) {
		int count = 0;
		//파일 한 줄씩 읽기.
		try (BufferedReader reader = new BufferedReader(new FileReader(file));){
			String line;
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
				//for라는 단어가 들어가 있는 문장 찾기.
				//정규식 사용
				if(line.trim().matches("^for\\s*\\(.*")) {
					count++;
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException"+file.getAbsolutePath());
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("IOException"+file.getAbsolutePath());
			e1.printStackTrace();
		}
		
		return count;
	}
	
	//함수 이름 : countForStatements, return int, paraml : File dir
	public static int countForStatements(File dir) {
		int count=0;
		File [] files = dir.listFiles();
		if(null == files)return 0; 
		
		for(File file :files) {
			//디렉토리 
			if(file.isDirectory()==true) {
				count += countForStatements(file);
			//확장자가 *.java인 파일만
			//Ed6CountFor.java
			//파일명에 "."포함될 수 있음.
			//뒤에서 부터 읽는 API : lastIndexOf
			//파일명 : *.java
			}else if(file.getName().lastIndexOf("java")>-1) {
				count += countForInFile(file);
			}
		}
		return count;		
	}
	public static void main(String[] args) {
		//분석할 경로
		String dirPath = "D:\\JAP_20250317\\01_JAVA\\workplace";
		//String dirPath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J24\\src\\com\\pcwk\\ehr\\ed04";
		
		File rootDir = new File(dirPath);
		if(!rootDir.exists()) {
			System.out.println("경로가 존재하지 않습니다.");
			return;
		}
		
		int totalCount = countForStatements(rootDir);
		System.out.println("전체 for문: "+totalCount);
		
	}

}
