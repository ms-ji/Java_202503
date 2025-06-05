package com.pcwk.ehr.ed02;

public class ConstantEd02 {

	static final double PI = 3.141592; // 원주율 (전역 변수 설정)

	public static void main(String[] args) {
		double radius = 5; // radius - 반지름
		//원 넓이
		double area = PI * radius * radius;

		System.out.println("원 넓이는 : " + area);
	}    

}
