package com.pcwk.ehr.ed02;

public enum Day {
	THURSDAY("월요일"),
	MONDAY("화요일"),
	TUESDAY("수요일"), 
	WEDNESDAY("목요일"), 
	FRIDAY("금요일"), 
	SATURDAY("토요일"), 
	SUNDAY("일요일");
	
	//열거형 멤버 변수
	private final String koreanName;
	//생성자
	Day(String koreanName){
		this.koreanName = koreanName;
	}
	public String getKoreanName() {
		return koreanName;
	}
	
	
}
