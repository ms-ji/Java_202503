/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * 파일명: TcpServer.java <br/>
*/
package com.pcwk.ehr.ed01;

import java.io.*;
import java.net.*;

public class TcpServer {

	public static void main(String[] args) {
		try(ServerSocket serversocket = new ServerSocket(4000)){
			System.out.println("서버 대기 중...");
			
			//클라이언트 연결 수락
			Socket clientSocket = serversocket.accept();
			System.out.println("클라이언트 연결됨: "+clientSocket.getInetAddress());
			
			//클라이언트부터 메시지 수신
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String message = in.readLine();
			System.out.println("받은 메세지: "+message);
			
			//클라이언트로부터 메시지 송신
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			out.write("서버에서 받은 메시지: "+message+"\n");
			out.flush();
			
			in.close();
			out.close();
			clientSocket.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
