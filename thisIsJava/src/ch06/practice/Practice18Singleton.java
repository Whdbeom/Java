package ch06.practice;

public class Practice18Singleton {

	private static Practice18Singleton sgton = new Practice18Singleton();
	
	private Practice18Singleton() {
	}

	public static Practice18Singleton single() {
		return sgton;
	}

}
