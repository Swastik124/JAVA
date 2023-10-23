package com.silicon;

class A2
{
	int x=100;
}

class B2 extends A2
{
	int x=400;
	void show()
	{
		System.out.println("x="+super.x);    //For printing the super class 'x' value
		System.out.println("x="+x);      //Only printing the sub class 'x' value
	}
	
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		B2 ob=new B2();
		ob.show();
	}

}
