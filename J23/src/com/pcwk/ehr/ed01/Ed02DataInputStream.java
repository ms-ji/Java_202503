/**
 * 파일명:Ed02DataInputStream.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed01;

import java.io.*;

public class Ed02DataInputStream {

	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("Data.bin"));) {
			
			int number = dis.readInt();
			double pi = dis.readDouble();
			String message =dis.readUTF();
			boolean flag = dis.readBoolean();
			
			
			System.out.printf("읽은 값: %d, %f, %s, %b%n",number,pi,message,flag);
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");
	}

}
