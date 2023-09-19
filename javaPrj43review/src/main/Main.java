package main;

import javax.swing.event.MenuDragMouseEvent;

import emp.CounterEmp;
import menu.Menu;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("=====매머드=====");
		
		// 직원 준비
		CounterEmp counterEmp = new CounterEmp();
		
		// 카운터 직원 일 시작
		counterEmp.work();
		
		
	}

}
