/**
* 파일명:Formatter.java<br/>
* 생성일:2025-04-01
*/
package com.pcwk.ehr.ed02;

//클래스
public class Formatter {

//생성자
	public Formatter() {
		System.out.println("생성자");
	}

	// 메서드 오버로딩 : 매개변수의 순서가 다른 경우.
	public void Format(int a, String b) {
		System.out.println("정수: " + a + " 문자열: " + b);
	}

	public void Format(String b, int a) {
		System.out.println("문자열: " + b + " 정수: " + a);
	}

//main (실행)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter formatter = new Formatter();
		formatter.Format(14, "Java");// 정수: 14 문자열: Java
		formatter.Format("Java", 35);// 문자열: Java 정수: 35
	}

}
