package com.cognizant.shapes;

class Rectangle {
	void calculateArea()  {
		System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
	}
}
public class AreaCalculator extends Rectangle{
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		rectangle.calculateArea();
	}
}
