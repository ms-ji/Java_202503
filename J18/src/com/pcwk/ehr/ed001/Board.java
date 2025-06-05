 /**
 * 파일명:Board.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed001;

public class Board {
	private String subject; //제목
	private String content; //내용
	private String Writer; //저자
	/**
	 * @param subject
	 * @param content
	 * @param writer
	 */
	//생성자
	public Board(String subject, String content, String writer) {
		//super();
		this.subject = subject;
		this.content = content;
		this.Writer = writer;
	}
	//getter와 setter를 통한 private 객체 호출 준비
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	
	
}
