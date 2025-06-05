package com.pcwk.ehr.ed03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ed02TryWithResource {

	public static void main(String[] args) {
		// try-with-resource

		String filepath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J17\\src\\com\\pcwk\\ehr\\ed03\\Ed01ReadFIle.java";

		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {

			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());

		}
	}
}
