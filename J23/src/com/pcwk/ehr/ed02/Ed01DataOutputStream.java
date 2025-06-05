/**
 * 파일명:Ed01DataOutputStream.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed02;

import java.io.*;

public class Ed01DataOutputStream {

	public static void main(String[] args) {

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"));) {
			//홍길동 : 88 : 2
			//이상무 : 92 : 1
			dos.writeUTF("홍길동");
			dos.writeInt(88);
			dos.writeInt(2);
			
			dos.writeUTF("이상무");
			dos.writeInt(92);
			dos.writeInt(1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");

	}

}
