package com.pcwk.ehr.ed01;

import java.net.*;

public class Ed01InetAdress {

	public static void main(String[] args) {
		//String hostName = "naver.com";
		String hostName = "daum.net";
		
		try {
			InetAddress address = InetAddress.getByName(hostName);
			
			//특정 사이트의 IP 주소
			System.out.printf("특정 IP주소: %s%n",address.getHostAddress());
			System.out.println("---------------------");
			
			//모든 IP주소
			InetAddress[] ipArr = InetAddress.getAllByName(hostName);
			
			for(InetAddress ia : ipArr) {
				System.out.printf("모든 IP주소: %s%n",ia.getHostAddress());
			}
			System.out.println("---------------------");
			
			//로컬 호스트 IP 주소
			InetAddress localAddress = InetAddress.getLocalHost();
			System.out.printf("호수트 이름: %s%n",localAddress.getHostName());
			System.out.printf("IP주소: %s%n",localAddress.getHostAddress());
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
