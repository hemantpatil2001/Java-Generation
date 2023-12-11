/*Part 2: Weight Guru Challenge
Create a Java program that tells whether your body to weight ratio is good or could be better.
The java app should take in your weight and height from the console and calculate your body to weight ratio.
You can use this article as a standardized guide for how to apply the logic.*/

package Logic_Operators_Github;
import java.util.Scanner;
public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Height (in ft) : ");
		float height= sc.nextFloat();
		System.out.println("Enter Your Weight (in kg) : ");
		float weight= sc.nextFloat();
		
		if(height>=4 && height <5 && weight >= 22 && weight <= 44)
		{
			System.out.println("You are Normal");
		}
		else if(height>=4 && height <5 && weight > 44)
		{
			System.out.println("You are Overweight");
		}
		else if(height>=4 && height <5 && weight < 44)
		{
			System.out.println("You are Underweight");
		}
		if(height>=5 && height <6 && weight >= 45 && weight <= 80)
		{
			System.out.println("You are Normal");
		}
		else if(height>=5 && height <6 && weight > 80)
		{
			System.out.println("You are Overweight");
		}
		else if(height>=5 && height <=6 && weight < 45)
		{
			System.out.println("You are Underweight");
		}
		else
		{
			System.out.println("Sorry!!! Unable to fetch Data");
		}

	}

}
