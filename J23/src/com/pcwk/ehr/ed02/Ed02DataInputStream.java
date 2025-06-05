/**
 * 파일명:Ed02DataInputStream.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ed02DataInputStream {
	
	
	public static void main(String[] args) {
		String name = null;
        int score = 0;
        int rank = 0;
		try (DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"));) {
			
			for(int i=0;i<2;i++) {
				name = dis.readUTF();
				score = dis.readInt();
				rank = dis.readInt();
				
			}
			
			System.out.printf("읽은 값: %s, %d, %d%n",name,score,rank);
		
			
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
