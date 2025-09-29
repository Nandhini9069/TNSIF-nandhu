package com.tnsif.entity.java;

public class CustomerDemo{
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setId(101);
		c1.setCname("Raja");
		c1.setCity("Villupuram");
		System.out.println(c1);
		Customer c2 = new Customer();
		c2.setId(101);
		c2.setCname("Nisha");
		c2.setCity("Cuddalore");
		System.out.println(c2);
	}
	
}
