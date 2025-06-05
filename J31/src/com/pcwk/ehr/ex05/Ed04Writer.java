package com.pcwk.ehr.ex05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ed04Writer {

	public static void main(String[] args) {
		try (Writer writer = new FileWriter("Writer01.txt");){
			char ch01 ='A';
			char ch02 ='1';
			char ch03 ='가';
			
			writer.write(ch01);
			writer.write(ch02);
			writer.write(ch03);
			
			//char 배열
			char[]chArr = {'B','C','D','나'};
			writer.write(chArr);
			writer.write("\n");
			
			//char 배열 off ~ len
			writer.write(chArr,1,3);
			
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("완료");
	}

}
