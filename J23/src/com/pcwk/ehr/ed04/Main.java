/**
 * 파일명:Main.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed04;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("이상무",23);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.dat"));) {
			
			oos.writeObject(member);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");
	}

}
