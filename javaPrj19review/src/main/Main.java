package main;

import practice.ArrayTest;
import practice.ControlTest;
import practice.MethodTest;
import practice.OperatorTest;
import practice.VarTest;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
	
//		VarTest vt = new VarTest();
//		vt.test();
		
//		OperatorTest ot = new OperatorTest();
//		ot.test();
		
//		ControlTest ct = new ControlTest();
//		ct.test();
		
//		ArrayTest at = new ArrayTest();
//		at.test();
		
		MethodTest mt = new MethodTest();
		int x = mt.test04(mt.test03(), 6);
		System.out.println(x);
		System.out.println(mt.test03());

		
	} // method

} // class
