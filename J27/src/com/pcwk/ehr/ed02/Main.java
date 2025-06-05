package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Day today = Day.THURSDAY;
		
		//출력:  목요일
		System.out.println("오늘은: "+today.getKoreanName());
		System.out.println("오늘은: "+today);
		
		//switch
		switch(today) {
		case MONDAY:
			System.out.println(today.getKoreanName()+" 한 주에 시작합니다.");
			break;
		case WEDNESDAY:
		case THURSDAY:
			System.out.println(today.getKoreanName()+" 즐거운 날 입니다.");
			break;	
		}

	}
}
