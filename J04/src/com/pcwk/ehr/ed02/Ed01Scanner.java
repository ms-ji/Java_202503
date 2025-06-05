package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed01Scanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); //Scanner 객체 생성
		
		System.out.print("오늘 요일은 어떻게 되나요?");
		String inputStr = scanner.nextLine();  //작성 후 enter 하기 전까지 대기
		System.out.printf("오늘은 %s 입니다.",inputStr);
		
		
		
	}

}
