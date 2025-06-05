/**
 * 파일명:Triangle.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed12;

public sealed class Triangle extends Shape permits Squar{

	@Override
	public void showMessage() {
		System.out.println("삼각형 입니다.");
	}
	//다시 봉인하여 squar만 허용
	
	
}
