package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {

		System.out.println("=====맥날=====");
		
		Burger b1 = new Burger("빅맥", 5000);
		
		String s = b1.getName();
		System.out.println(s);
		
		int p = b1.getPrice();
		System.out.println(p);
		
		
		
		
	}

}
