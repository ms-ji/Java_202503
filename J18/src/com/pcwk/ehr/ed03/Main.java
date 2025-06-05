 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed03;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Member member01 = new Member("james","이상무1","4321");
		Member member02 = new Member("james","이상무2","4321");
		
		//데이터는 같지만 주소가 다름.
		System.out.println(member01);
		System.out.println(member02);
		
		
		Set<Member> set = new HashSet<>();
		
		set.add(member01);
		set.add(member02);
		
		Iterator<Member> iter = set.iterator();
		
		while(iter.hasNext()) {//데이터가 있으면 true
			Member m = iter.next();
			System.out.println(m.getName());
		}
		
		//중복된 데이터를 확인하기 위해선 오버라이딩 필요.
		
	}

}
