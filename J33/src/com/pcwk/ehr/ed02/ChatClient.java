/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: ChatClient.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	private static String serverAddress = "192.168.100.80";
	private static final int PORT = 4000;
	

	public static void main(String[] args) {
	
	try(Socket socket = new Socket(serverAddress,PORT);
			//키보드 입력(Scanner 역할)
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);){
			
			//서버 메시지 받는 스레드
		 	Thread receiver = new Thread(()->{
		 		try {
		 			String message;
		 			while((message=in.readLine())!=null) {
		 				System.out.println("수신: "+message);
		 			}
		 		}catch(IOException e) {
		 			System.out.println("서버 연결 종료");
		 		}
		 	});
		 	receiver.start();
		 	
		 	// 키보드 입력 전송
		 	String input;
		 	while((input = keyboard.readLine())!=null) {
		 		out.println(input);
		 	}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
		

	}

}
