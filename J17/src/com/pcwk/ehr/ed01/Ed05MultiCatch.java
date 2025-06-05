package com.pcwk.ehr.ed01;

public class Ed05MultiCatch {

	public static void main(String[] args) {
		try {
			// ArithmeticException
			int[] numbers = { 14, 16, 19 };
			System.out.println(numbers[3]);
			
			int result = 10 / 0;


		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("배열의 인덱스 범위를 초과 했습니다.\n-->" + e.getMessage());
			} else if (e instanceof ArithmeticException) {
				System.out.println("정수를 0으로 나눌수 없습니다.\n-->" + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("내가 예상 못한 그외 예외.\\n-->" + e.getMessage());
		} finally {
			System.out.println("finally 예외 관계 없이 항상 수행.");

		}

	}
}
