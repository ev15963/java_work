package com.lsw;

public class MainClass {

	public static void main(String[] args) {
//		BasicUDPServer server = new BasicUDPServer(7777);
//		server.communicate();
		
		BasicUDPClient client = new BasicUDPClient("172.30.1.32",7777);
		client.communicate();
	}

}
