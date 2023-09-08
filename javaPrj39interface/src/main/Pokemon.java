package main;

public interface Pokemon {

	default void pika(boolean mute) {
		if(mute) {
			System.out.println("ㅇㅇ");
		} else {
			System.out.println("ㄴㄴ");
		}
	}
}
