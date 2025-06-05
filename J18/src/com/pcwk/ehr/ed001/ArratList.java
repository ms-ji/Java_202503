 /**
 * 파일명:ArratList.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed001;

import java.util.ArrayList;
import java.util.List;

public class ArratList {

	public static void main(String[] args) {
		//컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//객체 추가
		list.add(new Board("제목1","내용1","저자1"));
		list.add(new Board("제목2","내용2","저자2"));
		list.add(new Board("제목3","내용3","저자3"));
		list.add(new Board("제목4","내용4","저자4"));
		list.add(new Board("제목5","내용5","저자5"));
		
		//저장된 객체 수 ->size
		System.out.println("저장된 객체 수는: "+list.size());
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println();
		
		//모든 객체 하나씩 가져오기
	}
		
}
