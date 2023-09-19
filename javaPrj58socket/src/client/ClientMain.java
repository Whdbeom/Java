package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Client 시작.~@@@@");

		Socket socket = new Socket("localHost", 12345);
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		PrintStream ps = new PrintStream(out);
		
		// 스트림 준비 (수신)
		InputStreamReader isr =new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		
		boolean x = true;
		while(true) {
			// 데이터 쓰기
			System.out.print("보낼 메세지 : ");
			String msg = sc.nextLine();
			ps.println(msg);
			
			// 데이터 읽기
			String str = br.readLine();
			System.out.println("서버가 보낸 메세지 : " + str);
		}
		
	} // main

} // class
