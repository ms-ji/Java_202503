package com.pcwk.ehr.ed02;

public class ConstantEd01 {

	public static void main(String[] args) {
		// 저장 : ctrl + s
		//Undo : ctrl + z
		//redo : ctrl + Y
		// 상수
		// 상수(Constant)란 프로그램에서 한 번 정의되면 값을 변경할 수 없는 변수를 의미함.
		// 상수는 프로그램에서 특정 값이 변하지 않음을 보장할 때 사용됨.

		final int MAX_AGE = 23;

		System.out.println("MAX_AGE 값: " + MAX_AGE);
		//상수이므로 값 변경 불가(한번 정의하면 바꿀 수 없음)
		//MAX_AGE = 22;
		
	}

}
