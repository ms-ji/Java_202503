/**
* 파일명:Ed02Varargs.java<br/>
* 생성일:2025-04-01
*/
package com.pcwk.ehr.ed03;

public class Ed02Varargs {

	public void printDisp(String label, int... numbers) {
		System.out.println("label: " + label);

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("합계: " + sum);
	}

	public static void main(String[] args) {
		Ed02Varargs ed = new Ed02Varargs();
		ed.printDisp("Numbers", 1, 2, 3, 4, 5, 6);
		System.out.println("==================");
		ed.printDisp("No numbers");
	}

}
