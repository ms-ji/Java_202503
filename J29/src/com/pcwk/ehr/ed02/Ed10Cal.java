/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * Class Name: Ed10Cal.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.time.*;
import java.util.*;

public class Ed10Cal {
	public static void printCalendar(int year, int month) {
		//System.out.printf("year %d month %d%n",year,month);
		//시작일 : 1
		//그 달의 총 일수 : 28,29,30,31
		//시작 요일 : 1일에 시작 요일
		
		//시작일
		LocalDate firstDay = LocalDate.of(year, month, 1);
		
		//시작 요일
		//MONDAY : 1, SUNDAY : 7
		DayOfWeek firstWeekDay = firstDay.getDayOfWeek();
		System.out.println("시작 요일: "+firstWeekDay.getValue());
		
		
		//"월","화","수","목","금","토","일"
		System.out.printf("\n[%d년 %d월]\n",year,month);
		String []dayOfWeek = {"월","화","수","목","금","토","일"};
		
		//요일 출력
		for(String week:dayOfWeek) {
			System.out.print(week+"\t");
		}
		System.out.println("\n----------------------------------------------------\n");
		//시작 요일 공백 : 
		int startDay = firstWeekDay.getValue();
		for(int i = 1;i<startDay;i++) {
			System.out.print("\t");
		}
		//그 달의 총 일수
		int lengthofmonth = firstDay.lengthOfMonth();
		
		//날짜 출력
		for(int day = 1;day<=lengthofmonth;day++) {
			System.out.printf("%d\t",day);
			//일요일마다 줄바꿈:(day+요일-X)%7==0
			if((day+startDay-1)%7==0) {
				System.out.println();
			}
		}
		

	}

	public static void main(String[] args) {
		//연도 입력 (예: 2025):
		//월 입력(1~12): 
		Scanner sc = new Scanner(System.in);
		System.out.printf("연도 입력 (예: 2025): ");
		int year = sc.nextInt();
		//System.out.printf("year %d%n",year);
		
		System.out.printf("월 입력(1~12):  ");
		int month = sc.nextInt();
		//System.out.printf("month %d%n",month);
		
		printCalendar(year, month);
		
		
		
	}

}
