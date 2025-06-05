/**
 * 파일명:Ed03Copy.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed06;

import java.io.*;

public class Ed03Copy {

	public static void main(String[] args) {
		String filename = "D:\\JAP_20250317\\01_JAVA\\workplace\\J23\\src\\com\\pcwk\\ehr\\ed06\\Ed03Copy.java";
		String copyFile = "Ed03CopyFile_java.txt";
		
	
		try (BufferedReader reader = new BufferedReader(new FileReader(filename));
				BufferedWriter writer = new BufferedWriter(new FileWriter(copyFile));
				){
			String line;
			while((line = reader.readLine())!=null) {
				//System.out.println(line);
				//System.out.println();
				writer.write(line);
				writer.newLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("┌───────────────────────┐");
		System.out.println("│ complete              │");
		System.out.println("└───────────────────────┘");
		
	}

}
