package com.silicon;

class A
{
	void m1()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Hello");
	}
}
public class InheritanceExample1 {

	public static void main(String[] args) {
		B ob= new B();
		ob.m1();
		ob.m2();
	}

}
