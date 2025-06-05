package com.pcwk.ehr.ed05;

import java.util.*;

public class Ed01ArrayList {

	public static void main(String[] args) {
		List<NoticeBoard> list = new ArrayList<>(); 
		
		//객체 추가
		list.add(new NoticeBoard(1,"00_반갑습니다.", "이상무", "25.03.17", 0, 79));
		list.add(new NoticeBoard(2,"01_Windows, JDK 환경설정", "이상무", "25.03.17", 0, 44));
		list.add(new NoticeBoard(3,"02_통합 개발 환경(IDE), 주석, 변수", "이상무", "25.03.17", 0, 28));
		
		//저장된 총 객체 수(사이즈)
		System.out.println("총 객체 수: "+list.size());
		
		//특정 인덱스 데이터 조회
		System.out.println("특정 인덱스 데이터 조회: "+list.get(2));
		System.out.println("----------------------------");
		
		//객체 삭제 
		//2번 삭제
		//list.remove(1);
		//No 기준으로 삭제 : 3번
		for(NoticeBoard board : list) {
			if(board.getNo()==3) {
				list.remove(board);
				break; 
				//break문을 생략하면 for문을 빠져나오지 못해 오류 발생
				//java.util.ConcurrentModificationException
			}		
		}		
		
		//모든 객체 조회
		for(NoticeBoard board : list) {
			//1|00_반갑습니다.|이상무|25.03.17|0|79
			System.out.print(board.getNo()+"|");
			System.out.print(board.getTitle()+"|");
			System.out.print(board.getWriter()+"|");
			System.out.print(board.getRegDate()+"|");
			System.out.print(board.getSuggestion()+"|");
			System.out.print(board.getViews()+"|");
			System.out.println();
		}
		
	}

}
