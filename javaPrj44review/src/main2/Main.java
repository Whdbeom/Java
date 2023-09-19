package main2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Menu("치토스", 5000));
		list.add(new Menu("뿌셔뿌셔", 3000));
		list.add(new Menu("허니버터칩", 500));
		list.add(new Menu("포카칩", 10000));

		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(int i = 0; i < list.size(); i++) {
			Menu menu = (Menu) list.get(i);
			System.out.println(menu.getName());
		}
		
		for(int i = 0; i < list.size(); i++) {
			Menu menu = (Menu) list.get(i);
			System.out.println(menu.getPrice());
			
		}
	}
	
}
