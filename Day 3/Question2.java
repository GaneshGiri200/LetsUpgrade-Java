package Day3;
import java.util.Scanner;
public class Question2 
{
	public static void main(String args[]) 
	{
		String name;
		int dob, mob, yob, salary;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = scan.next();
		
		System.out.println("Enter the date of birth: ");
		dob = scan.nextInt();
		
		System.out.println("Enter the month of birth: ");
		mob = scan.nextInt();
		
		System.out.println("Enter the year of birth: ");
		yob = scan.nextInt();
		
		System.out.println("Enter your Salary: ");
		salary = scan.nextInt();
		scan.close();
		
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Age:"+(2020-yob));
		System.out.println("Annual Salary: "+salary);
		
		if(salary < 200000)
		{
			System.out.println("Tax: No tax");
		}
		else if(salary >= 200000 && salary < 300000)
		{
			System.out.println("5% Tax: "+salary*0.05);
		}
		else if(salary >= 300000 && salary < 400000)
		{
			System.out.println("10% Tax: "+salary*0.10);
		}
		else if(salary >= 400000 && salary < 500000)
		{
			System.out.println("15% Tax: "+salary*0.15);
		}
		else if(salary >= 500000)
		{
			System.out.println("20% Tax: "+salary*0.20);
		}
		
	}
}
