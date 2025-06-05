/**
 * 파일명 : Ed03ArrayElementsIndex.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed03ArrayElementsIndex {
	
	//메서드
	public static void disp(int []number) {
		for(int i=0;i<number.length;i++) {
			System.out.printf("number[%d] = %d%n",i,number[i]);
	}
}
	public static void main(String[] args) {
		
		
		//배열 값 초기화 1:
		int []numbers = new int[5];
		
		//전체 데이터 출력
		for(int i =0;i<numbers.length;i++) {
			System.out.printf("number[%d] = %d%n",i,numbers[i]);
			
		}//for end
		
		//배열 값 초기화 2:
		int []numbers02 = new int[]{11,22,33,44,55};
		for(int i =0;i<numbers02.length;i++) {
			System.out.printf("numbers02[%d] = %d%n",i,numbers02[i]);
			
		} // for end
		
		//배열 값 초기화 3 :
		int [] numbers03 = {14,16,19,50,54};
		disp(numbers03);
		
		//합계 : numbers03
		int sum = 0;
		for(int i =0;i < numbers03.length;i++) {
			sum += numbers03[i];
		}
		System.out.println("sum: "+sum);
		//평균 : numbers03
		double avg = sum/(numbers03.length*1.0);
		System.out.println("avg: "+avg);
	}

}
