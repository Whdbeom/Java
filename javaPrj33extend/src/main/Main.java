package main;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;
import mob.Turtle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=====상속=====");
		
//		Pokemon p = new Pokemon();
//		p.setName("피카츄");
//		p.setHp(100);
//		p.setAtk(10);
//		p.setDef(1);
		
//		System.out.println(p.getName());
//		System.out.println(p.getHp());
//		System.out.println(p.getAtk());
//		System.out.println(p.getDef());

//		System.out.println(p.toString());
		
		
		// ===============================
		
		Pikachu pikachu = new Pikachu();
		pikachu.to();
		
		Pairi pairi = new Pairi();
		pairi.to();
		
		Turtle turtle = new Turtle();
		turtle.to();
	}// main

	
} // class
