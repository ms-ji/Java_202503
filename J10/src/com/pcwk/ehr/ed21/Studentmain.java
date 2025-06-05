/**
 * 파일명 : Studentmain.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed21;

public class Studentmain {
	//실행 클래스 : main() 메소드를 가지고 있는 실행 가능한 클래스
	public static void main(String[] args) {
		//Student 객체 생성
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
