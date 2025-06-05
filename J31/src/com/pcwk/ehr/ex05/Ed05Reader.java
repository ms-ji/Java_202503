package com.pcwk.ehr.ex05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ed05Reader {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("Writer01.txt");){
			int data = 0;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
			
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e1) {
			
		}

	}

}
