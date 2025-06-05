/**
 * Package Name : com.pcwk.ehr.ex04 <br/>
 * Class Name: Desialization.java <br/>
*/
package com.pcwk.ehr.ex04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desialization {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.dat"));){
			Member member = (Member) ois.readObject();
			
			System.out.println("읽어온 멤버 : "+member.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
