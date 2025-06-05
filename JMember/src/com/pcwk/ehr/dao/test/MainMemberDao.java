/**
 * Package Name : com.pcwk.ehr.dao.test <br/>
 * Class Name: MainMemberDao.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.dao.test;

import com.pcwk.ehr.member.dao.MemberDao;
import com.pcwk.ehr.member.vo.MemberVO;

public class MainMemberDao {

	private MemberVO member01;
	private MemberVO member02;
	private MemberVO member03;

	public MainMemberDao() {
		member01 = new MemberVO("pcwk06", "이상무06", "4321a", "jamesol@paran.com", 0, "2025-04-22", "일반");
		member02 = new MemberVO("pcwk07", "이상무07", "4321a", "jamesol@paran.com", 0, "2025-04-22", "관리자");
		member03 = new MemberVO("pcwk08", "이상무08", "4321a", "jamesol@paran.com", 0, "2025-04-22", "일반");
	}

	public void doSave() {
		MemberDao dao = new MemberDao();
		
		int flag = dao.doSave(member01);
		// doSave() 테스트
	
		if (flag == 0) {
			System.out.println("등록 실패");
		} else {
			System.out.println("등록 성공");
		}
	
	}
	public void isExistsMember() {
		MemberDao dao = new MemberDao();
		MemberVO param = new MemberVO();
		

		int flag = dao.doSave(member01);
		
		if (flag == 0) {
			System.out.println("조회 실패");
		}else if(flag ==2) {
			System.out.println("기존 회원이 존재합니다.");
		} else {
			System.out.println("조회 성공");
		}
	}
	public void doSelectOne() {
		MemberDao dao = new MemberDao();
		MemberVO param = new MemberVO();
		param.setMemberId("pcwk01");
		MemberVO outvo = dao.doSelectOne(param);
		
		if(null != outvo) {
			System.out.println("회원 조회 성공: "+outvo);
		}else {
			System.out.println("회원 조회 실패");
		}
		
	}

	public static void main(String[] args) {

		MainMemberDao main = new MainMemberDao();
		
		main.doSave();
		main.isExistsMember();
		//회원 단권 조회
		
	}

}
