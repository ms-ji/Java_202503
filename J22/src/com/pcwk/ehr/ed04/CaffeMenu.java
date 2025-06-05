/**
* 파일명:CaffeMenu.java <br/>
* 생성일:2025-04-16
*/
package com.pcwk.ehr.ed04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pcwk.ehr.ed03.NoticeBoard;

public class CaffeMenu {
	private int no;
	private String name;
	private int price;

	/**
	 * @param no
	 * @param name
	 * @param price
	 */
	public CaffeMenu(int number, String name, int price) {
		super();
		this.no = number;
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return no;
	}

	public void setNumber(int number) {
		this.no = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CafeMenu [no: " + no + ", name: " + name + ", price]";
	}

	public static void doSave() {

		Scanner sc = new Scanner(System.in);

		System.out.print("음료명을 입력하세요>");
		String a = sc.nextLine();
		System.out.print("가격을 입력하세요>");
		int b = sc.nextInt();

		List<CaffeMenu> list = new ArrayList<>();
		list.add(new CaffeMenu(1, a, b));

		System.out.println("등록을 종료 합니다.");
		System.out.println();
		System.out.println("==메뉴 목록==");

		for (CaffeMenu cm : list) {
			int j = 1;
			System.out.print(j + "|");
			System.out.print(a + "|");
			System.out.print(b + "|");
			j++;
		} // for end
	}

}
