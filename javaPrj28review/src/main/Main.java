package main;

import java.util.Scanner;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("복습");
		
		Pokemon p = new Pokemon();
		
		boolean zz = true;
		while(zz) {
		System.out.println("1.추가 2.리스트 3. 4.종료");
		int sel = sc.nextInt();
		
			switch(sel) {
				case 1 : p.makePoke(); break;
				case 2 : p.pokeList(); break;
				case 3 : break;
				case 4 : System.out.println("종료");
					zz = false;
			}
		}
		
	}
	
}
