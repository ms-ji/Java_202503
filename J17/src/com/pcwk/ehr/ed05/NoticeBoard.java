package com.pcwk.ehr.ed05;

public class NoticeBoard {
	private int	    no         ;//번호	 
	private String	title      ;//제목	 
	private String	writer     ;//글쓴이
	private String	regDate    ;//작성일
	private int	    suggestion ;//추천	 
	private int	    views      ;//조회수
	
	//기본 생성자
	public NoticeBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 필드 객체의 생성자
	 * @param no
	 * @param title
	 * @param writer
	 * @param regDate
	 * @param suggestion
	 * @param views
	 */
	public NoticeBoard(int no, String title, String writer, String regDate, int suggestion, int views) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
		this.suggestion = suggestion;
		this.views = views;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(int suggestion) {
		this.suggestion = suggestion;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	@Override
	public String toString() {
		return "NoticeBoard [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate
				+ ", suggestion=" + suggestion + ", views=" + views + "]";
	}
	
	
}
