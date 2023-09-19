package main3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(new Menu("호밀빵", 500));
		list.add(new Menu("피자빵", 200));
		list.add(new Menu("소금빵", 800));
		list.add(new Menu("소세지빵", 100));
		
		int x = list.size();
		
		for(int i = 0; i < x; i++) {
			System.out.println(list.get(i));
		}
		
		for(int i = 0; i < x; i++) {
			Menu menu = (Menu) list.get(i);
			System.out.println(menu.getName());
		}
		for(int i = 0; i < x; i++) {
			Menu menu = (Menu) list.get(i);
			System.out.println(menu.getPrice());
		}
		
	}

}
