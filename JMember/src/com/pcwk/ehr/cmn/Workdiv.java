/**
 * Package Name : com.pcwk.ehr.member.dao <br/>
 * Class Name: Workdiv.java <br/>
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
package com.pcwk.ehr.cmn;

import java.util.List;

import com.pcwk.ehr.member.vo.MemberVO;

/**
 * 
 */
public interface Workdiv<T> {

	/**
	 * 회원 정보 신규 등록
	 * @param dto
	 * @return 0(등록 실패)1(등록 성공)
	 */
	//MemberVO dto 매개변수는 도서정보에는 쓸 수 없음. 
	//이는 도서정보 저장에도 쓸 수 있도록 바꿔야 함.
	//방법1. 상속, 방법2. Generic
	int doSave(T dto);

	/**
	 * 회원 단건 조회
	 * @param dto
	 * @return MemberVO
	 */
	MemberVO doSelectOne(T dto);

	/**
	 * 회원 목록 조회
	 * @param dto
	 * @return List<MemberVO>
	 */
	List<MemberVO> doRerieve(T dto);

	/**
	 * 회원 정보 수정
	 * @param dto
	 * @return 0(등록 실패)1(등록 성공)
	 */
	int doUpdate(T dto);

	/**
	 * 회원 정보 삭제
	 * @param dto
	 * @return 0(등록 실패)1(등록 성공)
	 */
	int doDelete(T dto);

}