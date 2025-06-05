package com.pcwk.ehr.ed02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본 파일 경로:(.\\J32\\example.txt) ");
		String orgFileName = sc.nextLine();
		
		System.out.println("복사 파일 경로:(.\\J32\\example02.txt) ");
		String saveFileName  = sc.nextLine();
		
		System.out.printf("원본파일경로: %s%n", orgFileName);
		System.out.printf("복사파일경로: %s%n", saveFileName);
		
		//1. 디렉토리명 구하기
		File orgfile = new File(orgFileName);
		//원본 파일이 없는 경우 메세지
		if(orgfile.isFile()==false) {
			System.out.println("원본 파일 없음.");
		}
		System.out.println("원본 디렉토리:" + orgfile.getName());
		
		//2.디렉토리가 없으면 디렉토리가 존재하지 않음 생성
		//getParent : 그 파일이 위치한 디렉터리의 경로를 반환
		File orgDir = new File(orgfile.getParent());
		//디렉토리가 존재하지 않으면 디렉토리를 생성한다.
		if(orgDir.isDirectory()==false) {
			String dirMessage = orgDir.mkdirs()?"디렉토리 생성":" ";
			//메세지 출력
			System.out.println("dirMessage: " + dirMessage);
		}
		//3.파일 및 디렉토리 복사가 성공되었을 떄 메세지 출력
		File savefile = new File(saveFileName);
		File saveDir = new File(savefile.getParent());
		
		if(saveDir.isDirectory()==false) {
			String dirMessage = orgDir.mkdirs() ? "저장 디렉토리 생성" : " ";
			System.out.println("dirMessage: " + dirMessage);
		}
		//4.복사
		Path orgPath = Paths.get(orgfile.getAbsolutePath());
		Path savePath = Paths.get(saveFileName);
		
		try {
			Files.copy(orgPath, savePath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사가 성공되었습니다.");
	}

}
