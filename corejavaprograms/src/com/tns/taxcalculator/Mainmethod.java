package com.tns.taxcalculator;

import java.util.Scanner;

public class Mainmethod {

	public static void main(String[] args) {

		Taxcalculator t = new Taxcalculator();
		Person p = new Person();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		p.setName(name);

		System.out.println("Enter Income: ");
		int income = sc.nextInt();
		p.setIncome(income);

		t.calculateTax(p);

		System.out.println(p.toString());

	}

}

