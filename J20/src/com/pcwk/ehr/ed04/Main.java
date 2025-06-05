 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-14
 */
package com.pcwk.ehr.ed04;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		String filePath = "D:\\JAP_20250317\\01_JAVA\\workplace\\J20\\src\\dev_config.properties";
		
		try(FileInputStream fis = new FileInputStream("dev_config.properties")){
			prop.load(fis);
			
			String userName = (String)prop.get("db.username");
			String password = prop.getProperty("db.password");
			String appName = prop.getProperty("app.name");
			
			System.out.println("DB 사용자: "+userName);
			System.out.println("DB 비밀번호: "+password);
			System.out.println("app 이름: "+appName);
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
