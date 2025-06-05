/**
 * 파일명:Ed03.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ed03 {

	public static void main(String[] args) {
		
		//Unhandled exception type FileNotFoundException
		//Checked Exception
		try {
			FileInputStream file = new FileInputStream("fileName");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
