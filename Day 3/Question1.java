package Day3;
import java.util.Scanner;
public class Question1
{
	public static void main(String[] args) 
	{
		int physics, chemistry, math, biology, english;
		float result;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the mark you got in physics :");
			physics = scan.nextInt();	
		}while(physics > 100);
		
		do
		{
			System.out.println("Enter the mark you got in chemistry :");
			chemistry = scan.nextInt();
		}while(chemistry > 100);
		
		do
		{
			System.out.println("Enter the mark you got in math :");
			math = scan.nextInt();
		}while(math > 100);
		
		do
		{
			System.out.println("Enter the mark you got in biology :");
			biology = scan.nextInt();	
		}while(biology > 100);
		
		do
		{
			System.out.println("Enter the mark you got in english :");
			english = scan.nextInt();
		}while(english > 100);
		scan.close();
		
		result = physics + chemistry + math + biology + english;
		result = result/500*100;
		
		System.out.println();
		if(result < 35.00)
		{
			System.out.println("your percentage is "+result+" You are failed");
		}
		else if(result >= 35.00 && result <= 50.00)
		{
			System.out.println("Your percentage is "+result+" and your Grade is C");
		}
		else if(result >= 50.00 && result <= 60.00)
		{
			System.out.println("Your percentage is "+result+" and your Grade is B");
		}
		else if(result >= 60.00 && result <= 75.00)
		{
			System.out.println("Your percentage is "+result+" and your Grade is A");
		}
		else if(result >= 70.00 && result <= 100.00)
		{
			System.out.println("Your percentage is "+result+" and your Grade is C");
		}
				
	}
}
