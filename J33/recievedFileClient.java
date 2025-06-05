/**
 * Package Name : com.pcwk.ehr.ed04 <br/>
 * Class Name: FileClient.java <br/>
 */
package com.pcwk.ehr.ed04;

import java.io.*;
import java.net.*;

public class FileClient {
	private static int PORT = 9000;
	private static String SERVER_IP="192.168.100.165";
	public static void main(String[] args) {
		String fileName=".\\src\\com\\pcwk\\ehr\\ed04\\FileClient.java";
		try(Socket socket=new Socket(SERVER_IP, PORT)) {
			File file=new File(fileName);
			FileInputStream fis=new FileInputStream(file);
			
			OutputStream os=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			
			//filename
			dos.writeUTF(file.getName());
			//filesize
			dos.writeLong(file.length());
			
			byte[] buffer=new byte[4096];
			int read;
			
			while((read=fis.read(buffer))>0) {
				dos.write(buffer, 0, read);
			}//while end
			System.out.printf("파일 전송 완료:%s, 파일 사이즈: %d ",fileName,file.length());
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
