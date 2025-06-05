/**
 * 파일명:Ed01ConditionalOperator.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed03;

public class Ed01ConditionalOperator {

	public static void main(String[] args) {

		int a = 14;
		int b = 16;

		int max = (a > b) ? a : b;
		System.out.println("max: " + max);
		     
		String message = """
		법정 음주 연령은 개인이 합법적으로 알코올 음료를 마실 수 있는 최소 연령입니다.                                                     
		청소년보호법 제28조에 따라 술을 구입할 수 있는 때는 만 19세가 되는 해의 1월 1일부터입니다                                            
		청소년보호법에서는 청소년을 '만 19세 미만인 자로서 만 19세가 되는 해의 1월 1일을 맞이한 사람은 제외한다'고 규정하고 있습니다.   
				""";
		System.out.println(message);
		//세로 편집 : alt+shift+a
		int age =18;
		
		String flag = (age>=19)?"성년":"미성년";
		//나이는 18살 이구요 성인 여부는 : 미성년 입니다.
		
		System.out.printf("나이는 %d살 이구요 성인 여부는: %s 입니다.",age,flag);
	}

}
