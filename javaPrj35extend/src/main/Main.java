package main;

import car.Avante;
import car.Sonata;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("상속");
		
		Sonata sonata = new Sonata();
		Avante avante = new Avante();
		
		avante.accelerate();
		sonata.accelerate();
		
		System.out.println(avante.toString());
		System.out.println(sonata.toString());
		
		
	}
	
}
