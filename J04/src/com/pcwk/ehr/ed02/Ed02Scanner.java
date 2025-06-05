package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자리 정수를 입력 하세요>");
		
		int age = sc.nextInt();  //데이터 입력 후 enter 할 때까지 대기
		System.out.printf("나이는 %d %n",age-1);
		
		
	}

}
