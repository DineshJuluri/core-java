package com.tns.project;

public class Demo {
	public int s = 10;
	private int q = 11;
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.s);
		System.out.println(d.q);
		
		Demoprotected dp = new Demoprotected();
		System.out.println(dp.r);
	}
}
