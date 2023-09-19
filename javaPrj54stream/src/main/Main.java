package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.sound.sampled.AudioInputStream;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("Stream!@#$");
		
		File f= new File("C:\\Users\\종범\\Desktop\\hello.txt");
//		f.delete();
		
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write(2147483647);
//		
//		FileWriter fw= new FileWriter(f);
//		fw.write("우와ㅏㅏㅏㅏ");
//		fw.flush();
//		
		
//		PrintStream ps = new PrintStream(f);
//		ps.println("오와");
		
		//=================================
		
//		FileInputStream fis = new FileInputStream(f);
//		
//			for(int i = 0; i < 3; i++) {
//				int result = fis.read();
//				char x = (char) result;
//				System.out.print(x);
//			}
		
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
//	BufferedReader br = new BufferedReader(new FileReader(f));
	String result = br.readLine();
	String result2 = br.readLine();
	String result3 = br.readLine();
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);
	
	
	} // main

} // class
