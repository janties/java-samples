package main;

public class Employees
{
	private String name;
	private String surName;
	private String city;
	private String position;
	double salary;
	int age;

	public Employees(String name, String surName, String city, double salary, String position)
	{
		this.name = name;
		this.surName = surName;
		this.city = city;
		this.salary = salary;
		this.position = position;
	}
	//===========================================Methods
	public void changePosition(String newPos)
	{
		position = newPos;
	}

	public void raiseSalary(double raiseAmount)
	{
		salary += raiseAmount;
	}

	public void showInfo()
	{
		System.out.printf("Name = %s %s\n", name, surName);
		System.out.printf("Position = %s\n", position);
		System.out.printf("Salary = $%.2f\n", salary);
		System.out.printf("City = %s \n", city);
	}
}
