package Day2;

class Employee
{
	String name,city;
	int age;
	
	void display()
	{
		System.out.println("name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("City is: "+city);
	}
}
public class Question1 
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.name = "Manish";
		emp1.age = 24;
		emp1.city = "Mumbai";
		emp1.display();
		System.out.println();
		
		emp2.name = "Sameer";
		emp2.age = 25;
		emp2.city = "Hydrabad";
		emp2.display();
	}
}
