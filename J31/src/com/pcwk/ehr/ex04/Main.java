/**
 * Package Name : com.pcwk.ehr.ex04 <br/>
 * Class Name: Main.java <br/>
*/
package com.pcwk.ehr.ex04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("이상무", 23);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.dat"));) {
			oos.writeObject(member);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("완료");
	}

}
