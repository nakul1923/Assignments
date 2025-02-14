/*
 * An e-commerce store maintains an inventory of products and wants to sort them by price (lowest to highest).

Class Attributes:
productId (int)
productName (String)
price (double)
Implementation Details:
Implement Comparable<Product> and override compareTo() to sort products in ascending order of price.
Expected Output:
Products should be sorted by price (cheapest first).

 */

import java.util.*;

class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double price;

	Product(int id, String name, double price){

		this.id = id;
		this.name = name;
		this.price = price;
	}		


	public int getId(){

		return id;
	}

	public String getName(){

		return name;
	}

	public double getPrice(){

		return price;
	}

	public String toString(){

		return "Id = " + id + " : Name = " + name + " : Price = " + price;
	}

	public int compareTo(Product p){

		return (int)this.getPrice() - (int)p.getPrice();
	}


}

class Main{

	public static void main(String args[]){

		TreeSet<Product> t = new TreeSet<>();

		Product p1 = new Product(101,"Smartphone",20000.00);
		Product p2 = new Product(102,"Mixer",2000.00);
		Product p3 = new Product(103,"Radio",3000.50);
		Product p4 = new Product(104,"Bulb",200.00);

		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		System.out.println(t);

	}


}