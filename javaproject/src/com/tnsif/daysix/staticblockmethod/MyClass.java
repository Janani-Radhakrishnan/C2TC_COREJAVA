package com.tnsif.daysix.staticblockmethod;

public class MyClass {
	private int section ; 
	private static int srNo;
	
	static
	{
		System.out.println("-----------Within Static Block---------");
		srNo=1000;
	}
	
	//default constructor
		MyClass()
		{
			System.out.println("--------------Within Default Constructor-----------");
			srNo++;
			section++;		
		}

		@Override
		public String toString() {
			return "MyClass [Serial No "+srNo+", section=" + section + "]";
		}
		
		//static method
		static void display()
		{
			System.out.println("Serial No." +srNo);
		}
		
		public static void main(String[] args) {

			MyClass o1 = new MyClass();
			System.out.println(o1);

			// static method with class name
			MyClass.display();

			MyClass o2 = new MyClass();
			System.out.println(o2);
			MyClass.display();
			MyClass o3 = new MyClass();
			System.out.println(o3);
			MyClass.display();

		}
}
