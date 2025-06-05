/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed27;

public class Car {
	//필드 선언
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model,String color){
		this(model,color,250);
	}
	Car(String model,String color,int maxSpeed){
		this.model =model;
		this.color =color;
		this.maxSpeed =maxSpeed;
		
	}

}
