/**
 * Package Name : com.pcwk.ehr.dao.test <br/>
 * Class Name: Ex05Main.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.dao.test;

/**
 * 
 */
public class Ex05Main {
	
	public static void main(String[] args) {
		String massage = "pcwk01,이상무01,4321a|pcwk02,이상무02,4321a|pcwk03,이상무03,4321a";
		String[]arraystr = massage.split("\\|");
		for(String str : arraystr) {
			//System.out.println(str);
			
			String []arr = str.split(",");
			for(String str02 : arr) {
				System.out.print(str02+" ");
			}
		}
	}

}
