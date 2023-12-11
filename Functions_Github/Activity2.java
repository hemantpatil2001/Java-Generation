/*Create a new Java class that will have the following functionality:

Name should be CalculatorBrain
Implement a function for each aritmetic operation
Addition
Subtraction
Multiplication
Division
Add some code to the main method to invoke the aritmetic functions defined and 
verify it works as expected.*/

package Functions_Github;
import java.util.Scanner;
public class Activity2 {
	int Addition(int a,int b)
	{
		return a+b;
	}
	int Subtraction(int a,int b)
	{
		return a-b;
	}
	int Multiplication(int a,int b)
	{
		return a*b;
	}
	int Dividation(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a= sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b= sc.nextInt();
		System.out.println(" ========== Choose Operation =========");
		
		System.out.println("1. Adddition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Dividation");
		int num= sc.nextInt();
		Activity2 obj =new Activity2();
		if(num == 1)
		{
			System.out.println("Adddition : "+obj.Addition(a, b));
		}
		else if(num == 2)
		{
			System.out.println("Subtraction : "+obj.Subtraction(a, b));
		}
		else if(num == 3)
		{
			System.out.println("Multiplication : "+obj.Multiplication(a, b));
		}
		else if(num == 4)
		{
			System.out.println("Dividation : "+obj.Dividation(a, b));
		}
		else
		{
			System.out.println("Invalid Output");
		}

	}

}
