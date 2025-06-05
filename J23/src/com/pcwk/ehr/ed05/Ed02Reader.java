/**
 * 파일명:Ed02Reader.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed05;

import java.io.*;

public class Ed02Reader {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("pcwk_writer.txt");){
			//1문자
			int data = 0;
			while((data = reader.read())!=-1) {
				System.out.print((char)data);//캐스팅
			}
			
			
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
	}

}
