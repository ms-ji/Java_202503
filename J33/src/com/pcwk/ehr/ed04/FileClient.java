/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * 파일명: FileClient.java <br/>
*/
package com.pcwk.ehr.ed04;

import java.io.*;
import java.net.*;

public class FileClient {
	private static int PORT = 9000;
	private static String SERVER_IP ="192.168.100.80";

	public static void main(String[] args) {
		String filename =".\\src\\com\\pcwk\\ehr\\ed04\\FileServer.java";
		try(Socket socket = new Socket(SERVER_IP,PORT)){
			File file = new File(filename);
			FileInputStream fis =new FileInputStream(file);
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			//파일명
			dos.writeUTF(file.getName());
			
			//파일 사이즈
			dos.writeLong(file.length());
			
			byte[] buffer = new byte[4096];
			int read;
			
			while((read=fis.read(buffer))>0) {
				dos.write(buffer,0,read);
			}
			System.out.printf("파일 전송 완료: %s, 파일 사이즈: %d%n",filename,file.length());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
