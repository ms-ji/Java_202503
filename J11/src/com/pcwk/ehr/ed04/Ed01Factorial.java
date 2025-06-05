 /**
 * 파일명:Ed01Factorial.java<br/>
 * 생성일:2025-04-01
 */
package com.pcwk.ehr.ed04;

import com.pcwk.ehr.ed01.Main;

public class Ed01Factorial {
	int i = 10;

	void newMethod() {
		System.out.println(i);
		
		if(i == 0) { //함수를 벗어나는 조건 필요 !
			return; //프로그램 종료
		}
		i--;
		newMethod();
	}
	
	
	public static void main(String[] args) {
		Ed01Factorial ed = new Ed01Factorial();
		ed.newMethod();

	}

}
