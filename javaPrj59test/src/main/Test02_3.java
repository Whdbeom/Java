package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02_3 {

	public static void main(String[] args) throws Exception {

		Test02_3 t = new Test02_3();
		t.fileSave("C:\\Users\\종범\\Desktop\\hello.txt");
		
	}
	
	
	// 저장 ㅁㅔ소드
	
	public void fileSave(String fileName) throws Exception {
		// 파일 객체 준비
				File f = new File(fileName);
				
				//내보내는스트림 얻기
				FileWriter fw = new FileWriter(f);
				BufferedReader b = new BufferedReader(new FileReader(f));
				b.readLine();
				//객체 만들기
				Food food = new Food("사과", 20);
				
				//내보내기
				fw.write(food.getName() + ", " + food.getKcal());
				fw.write(food.toString());
				fw.flush();
				
	}

}
