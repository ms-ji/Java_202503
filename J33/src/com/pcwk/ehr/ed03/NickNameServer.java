/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일명: NickNameServer.java <br/>
*/
package com.pcwk.ehr.ed03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NickNameServer {
	private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());
	private static final int PORT = 8000;
	
	// ClientHandler 메서드
	static class ClientHandler extends Thread{
		private Socket socket;
		private PrintWriter out;
		private BufferedReader in;
		private String nickname;
		//생성자
		public ClientHandler(Socket socket) throws IOException {
			this.socket = socket;
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
		}
		private void boardcast(String message) {
			for(ClientHandler c : clients) {
				System.out.println(currentDateTime() + "받은 메시지: " + message);
				c.out.println(message);
			}
		}
		//메서드
		@Override
		public void run() {
			try {
				out.println("닉네임을 입력하세요: ");
				nickname = in.readLine();		
				boardcast(nickname+"님이 입장하셨습니다.");
				String message;
				while((message=in.readLine())!=null) {
					boardcast(nickname+": "+message);
				}
				
			}catch(IOException e) {
				System.out.println(currentDateTime()+"> "+nickname+" 연결 종료!");
			}finally {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				clients.remove(this);
				boardcast(nickname+"님이 퇴장 하셨습니다.");
			}
		}
	}
	// 날짜 시간 메서드
		public static String currentDateTime() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
			return sdf.format(new Date());
		}
	
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(PORT);
		System.out.println(currentDateTime()+": Server start, 포트: "+PORT);
		
		while(true) {
			Socket socket = serversocket.accept();
			ClientHandler client = new ClientHandler(socket);
			//list에 client추가 
			clients.add(client);
			
			//run 메서드 호출
			client.start();
		}
	}
}
