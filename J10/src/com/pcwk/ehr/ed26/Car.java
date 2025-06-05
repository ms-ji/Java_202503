/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed26;

public class Car {
	//필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxspeed;
	
	// 생성자 선언
	//1)
	public Car() {
		// TODO Auto-generated constructor stub
	}
	//2)
	Car(String model){
		this.model = model;
	}
	//3)
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	//4) 
	Car(String model,String color,int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
