package com.pcwk.ehr.ed01;

public class SwapEd01 {

	public static void main(String[] args) {
		int strawberryCup = 5;
		int milkCup = 10;
		
		System.out.println("교환 전 데이터 strawberryCup : "+ strawberryCup);
		System.out.println("교환 전 데이터 milkCup : "+ milkCup);
		
		//두 변수에 값을 교환 > 디버깅하여 값 확인 가능 
		int emptyCup = 0; //임시변수
		emptyCup = strawberryCup; //임시변수 : 5
		strawberryCup = milkCup;  // strawberryCup : 10
		milkCup = emptyCup;       // milkCup : 5  
		
		System.out.println("교환 후 데이터 strawberryCup : "+ strawberryCup);
		System.out.println("교환 후 데이터 milkCup : "+ milkCup);
		
	}

}
