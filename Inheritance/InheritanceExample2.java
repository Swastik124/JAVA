package com.silicon;

class A1
{
	int x;
}
 class B1 extends A1
 {
	 int y;
	 void calculate()
	 {
		 x=300;
		 y=400;
	 }
	 void show()
	 {
		System.out.println("x="+x);
		System.out.println("y="+y);
	 }
 }
public class InheritanceExample2 {

	public static void main(String[] args) {
		B1 ob=new B1();
		ob.calculate();
		ob.show();
	}

}
