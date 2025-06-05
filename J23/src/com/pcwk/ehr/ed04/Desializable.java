/**
 * 파일명:Desializable.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed04;

import java.io.*;

public class Desializable {

	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.dat"));){
			Member member = (Member) ois.readObject();
			
			System.out.println("읽어온 멤버: "+member.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
