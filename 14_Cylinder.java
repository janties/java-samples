package main;

public class Cylinder extends Circle
{
	//====================================>Instances
	// radius, PI;
	private double height;
	
	//====================================>Construction 
	public Cylinder()
	{
		height = 0.0;
	}
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	//====================================>Methods
	public double Volume()
	{
		return area() * height; 
		// area() == PI * (radius*radius) but pi and radius can't accessible private
	}
}