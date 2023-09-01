package main;

import java.util.Scanner;

public class Main {

	// 업다운 게임
	public static void main(String[] args) {
		
/* 	
        정답 숫자, 
		유저한테 숫자 입력, 
		업다운 판단, 
		입력 받고 판단 반복, 
		몇번만에 맞췄는지 알려주기
*/
		// 정답 숫자 준비
		int answer = (int)(Math.random()*100+1);
		// 시도 횟수
		int cnt = 0;
		
		while(true) {
			// 유저한테 정수 입력 받기	
			Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    
		    // 시도 횟수 증가
		    cnt++;
		    
		    // 판단
		    if(x < answer ) {
		    	System.out.println("업");
		    } else if(x > answer) {
		    	System.out.println("다운");
		    } else {
		    	System.out.println("정답");
		    	System.out.println("시도 횟수 : " + cnt);
		    	
		    		break;
		    		
		    }
		   
		}
	    
	}	//main

}	// class
