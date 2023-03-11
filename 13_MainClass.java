package main;

public class MainClass
{
	public static void main(String[] args)
	{
		Employees e1 = new Employees("Bill", "Gates", "Washington", 42, "Senior Engineer");
		e1.changePosition("Rich");
		e1.raiseSalary(99958);
		e1.showInfo();
	}

}
