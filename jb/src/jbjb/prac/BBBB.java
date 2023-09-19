package jbjb.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class BBBB {

	public static void main(String[] args) {

		output();

	}

	
	public static void output() {
		
		
	
		PrintWriter pw;
		File file;
		
		try {

			file = new File("C:\\Users\\종범\\Desktop\\hello.txt");
			pw = new PrintWriter(new FileWriter(file, true), true);
 
			pw.println(97);
			pw.println(65);
			pw.println("asdfsff");
			pw.println("dddd");
			pw.println("asdfsff");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
