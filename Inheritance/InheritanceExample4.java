package com.silicon;

class Vehicle
{
	void journey()
	{
		System.out.println("Journey by Vehicle");
	}
}

class Car extends Vehicle
{
	void journey()
	{
		System.out.println("Journey by car");
		super.journey();
	}
}
public class InheritanceExample4 {

	public static void main(String[] args) {
		Car c= new Car();
		c.journey();
	}

}
