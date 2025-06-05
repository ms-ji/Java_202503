package com.pcwk.ehr.ex05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ed10 {

	public static void exploreAndWriter(File dir, int Depth, BufferedWriter writer) throws IOException {
		String idnet="\t".repeat(Depth);
		
		//디렉토리와 파일 분리
		if(dir.isDirectory()==true) {
			writer.write(idnet+"[DIR]"+dir.getName());
			writer.newLine(); //OS Line Skip
			File[] files = dir.listFiles();
			
			if(null !=files) {
				for(File file:files) {
					exploreAndWriter(file,Depth+1,writer);
				}
			}
		} else {
			writer.write(idnet+"-파일: "+dir.getName());
			writer.newLine();
		}
	}
	public static void main(String[] args) {
	
		
		//탐색할 디렉토리
		File footDir = new File("D:\\JAP_20250317\\01_JAVA\\workplace\\J31\\src");
		
		//출력할 파일
		File outputFile = new File("dir.txt");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));){
			if(footDir.exists()==true) {
				exploreAndWriter(footDir, 0, writer);
				System.out.println("탐색 결과가 저장되었습니다."+footDir.getAbsolutePath());
			}else {
				System.out.println("지정된 경로가 존재하지 않습니다.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
