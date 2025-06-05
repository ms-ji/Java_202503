/**
 * Package Name : com.pcwk.ehr.ed02 <br/>
 * 파일명: ChatServer.java <br/>
*/
package com.pcwk.ehr.ed02;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ChatServer {
	private static final int PORT = 8000;
	// 중복 불가, 동기화 가능
	private static Set<PrintWriter> clientWriters = Collections.synchronizedSet(new HashSet<>());

	// 날짜 시간
	public static String currentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss");
		return sdf.format(new Date());
	}

	public static void main(String[] args) {
		System.out.println(currentDateTime() + " 채팅 서버 시작...");
		try (ServerSocket serversocket = new ServerSocket(PORT)) {
			while (true) {
				Socket clientSocket = serversocket.accept();
				System.out.println(currentDateTime() + " 클라이언트에 연결됨: " + clientSocket.getInetAddress());

				new ClientHandler(clientSocket).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 클라이언트 담당 Thread
	private static class ClientHandler extends Thread {
		private Socket socket;
		private PrintWriter out;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		// 모든 접속된 클라이언트에게 메세지를 전송
		public void broadcast(String message) {
			for (PrintWriter writer : clientWriters) {
				writer.println(message);
			}
		}

		public void run() {
			// InputStreamReader(byte stream) : char 스트림으로 전환
			try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
				// client OutputStream 정보 저장
				out = new PrintWriter(socket.getOutputStream(),true);
				clientWriters.add(out);

				String message;
				while ((message = in.readLine()) != null) {
					System.out.println(currentDateTime() + "받은 메시지: " + message);

				}

			} catch (IOException e) {
				System.out.println("클라이언트 연결 해제.");
			} finally {
				if (null != out) {
					clientWriters.remove(out);
				}
				try {
					socket.close();
				} catch (IOException e) {

				}
			}
		}
	}
}
