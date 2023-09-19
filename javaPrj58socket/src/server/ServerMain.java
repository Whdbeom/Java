package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.naming.ldap.SortKey;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		
		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====소켓=====");

		// 서버 소켓 생성 (연결 받을 수 있음)
		ServerSocket serverSocket= new ServerSocket(12345);
		
		// 연결 대기하기
		System.out.println("연결 대기중......");
		Socket socket = serverSocket.accept();
		InetAddress inetAddress = socket.getInetAddress();
		System.out.println(inetAddress + " 연결 됨!");
		
		// 소켓 스트림 준비
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		// 스트림 준비 (수신)
		InputStreamReader isr =new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		
		// 스트림 준비 (발신)
		PrintStream ps = new PrintStream(out);
		
		while(true) {
			// 데이터 읽기
			String str = br.readLine();
			System.out.println("클라이언트가 보낸 메세지 : " + str);
			
			// 데이터 보내기
			System.out.print("보낼 메세지 : ");
			String msg = sc.nextLine();
			ps.println(msg);
		} 
	
	} // main
	
} // class
