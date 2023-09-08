package main;

import java.util.Arrays;

public class Sample {

	private int x1;
	private int x2;
	private int x3;
	private int x4;
	private int x5;
	
	public Sample() {
	}

	public Sample(int x1, int x2, int x3, int x4, int x5) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.x5 = x5;
	}

	public static void main(String[] args) {
		
		Sample[] sample = new Sample[5];
		
		
		for(int i = 0; i < sample.length; i++) {
			int a = (int)(Math.random()*45+1);
			int b = (int)(Math.random()*45+1);
			int c = (int)(Math.random()*45+1);
			int d = (int)(Math.random()*45+1);
			int e = (int)(Math.random()*45+1);
			sample[i] = new Sample(a, b, c, d, e);
		}
		
		System.out.print(sample[0].x1 + "   ");
		System.out.print(sample[0].x2+ "   ");
		System.out.print(sample[0].x3+ "   ");
		System.out.print(sample[0].x4+ "   ");
		System.out.println(sample[0].x5+ "   ");
		
		System.out.print(sample[1].x1+ "   ");
		System.out.print(sample[1].x2+ "   ");
		System.out.print(sample[1].x3+ "   ");
		System.out.print(sample[1].x4+ "   ");
		System.out.println(sample[1].x5+ "   ");
		
		System.out.print(sample[2].x1+ "   ");
		System.out.print(sample[2].x2+ "   ");
		System.out.print(sample[2].x3+ "   ");
		System.out.print(sample[2].x4+ "   ");
		System.out.println(sample[2].x5+ "   ");
		
		System.out.print(sample[3].x1+ "   ");
		System.out.print(sample[3].x2+ "   ");
		System.out.print(sample[3].x3+ "   ");
		System.out.print(sample[3].x4+ "   ");
		System.out.println(sample[3].x5+ "   ");
		
		System.out.print(sample[4].x1+ "   ");
		System.out.print(sample[4].x2+ "   ");
		System.out.print(sample[4].x3+ "   ");
		System.out.print(sample[4].x4+ "   ");
		System.out.println(sample[4].x5+ "   ");
		
	}




	
}


