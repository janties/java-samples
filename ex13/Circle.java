package main;

public class Circle 
{
	//====================================>Instances
	private double radius;
	private final double PI = 3.14;	// final = constant
	//====================================>Construction 
	public Circle()
	{
		radius = 0.0;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	//====================================>Methods
	public double area()
	{
		return PI* radius * radius;
	}
	
	public double perimeter()
	{
		return 2 * PI * radius;
	}
	//================================================
}
