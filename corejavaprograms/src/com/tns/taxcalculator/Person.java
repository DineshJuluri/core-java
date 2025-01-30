package com.tns.taxcalculator;

public class Person {
	private String name;
	private int tax;
	private int income;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", tax=" + tax + ", income=" + income + "]";
	}

}
