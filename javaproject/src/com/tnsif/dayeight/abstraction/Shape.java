package com.tnsif.dayeight.abstraction;

public abstract class Shape {
	 protected float area;
	 
	 //abstract method
	 abstract void calArea();
	 
	 //concrete method
	 void show() {
		 System.out.println("Area of shape is "+area);
	 }
	 
	 public static void main(String[] args) {
		 Square sq = new Square();
		 Rectangle r1 = new Rectangle();
		 sq.calArea();
		 r1.calArea();
		 r1.show();
		 
		 System.out.println("-------------------");
		 
		 Shape shape;
		 shape = new Square(12.5f);
		 shape.calArea();
		 shape.show();
		 
		 shape= new Rectangle(10,20);
		 shape.calArea();
		 shape.show();
	 }
}
