package com.pcwk.ehr.ed02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", "개발자"), new Member("김나라", "디자이너"), new Member("신용권", "개발자")

		);

		List<Member> developers = list.stream() // 스트림으로 변환 : 데이터 흐름 시작
				.filter(m -> m.getJob().equals("개발자"))// 직업이 개발자인 경우만 통과
				.collect(Collectors.toList());// 조건에 맞는 객체들을 새 리스트에 수집

		developers.stream().forEach(m -> System.out.println(m.getName()));
	}

}
