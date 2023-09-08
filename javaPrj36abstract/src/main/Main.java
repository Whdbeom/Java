package main;

import car.Avante;
import car.Car;
import car.Lcid;
import car.Sonata;

public class Main {

	public static void main(String[] args) {

		System.out.println("추상화 ~~ ~~~  ~ ~");
		
		// 소나타 n대 생성 
		int n = 5;
		Car[] sonataArr = new Car[n];
		for(int i = 0; i < sonataArr.length; i++) {
			sonataArr[i] = new Sonata();
			System.out.println(i +"번 : " + sonataArr[i]);
		}
		
	}

}
