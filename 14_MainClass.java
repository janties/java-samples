package main;

public class MainClass {

	public static void main(String[] args)
	{
		Circle daire = new Circle(2);
		Cylinder silindir = new Cylinder(4, 5);

		System.out.println(daire.area());//			area of circle
		System.out.println(silindir.area());//		area of circle
		System.out.println(silindir.volume());//	volume of cylinder
	}

}
