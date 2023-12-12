/*Activity 3: Variable Naming and Type Casting
Open your IntelliJ Idea IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. 
hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle 
and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the 
result of the operations.
Print out the results of the two operations in the console.*/
	
package Github_Variables;
import java.util.Scanner;
public class Activity3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area,perimeter;
		int diameter,radius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Diameter of Circle : ");
		diameter = sc.nextInt();
		radius = diameter/2;
		area = 3.14 *radius*radius;
		perimeter = 2*3.14*radius;
		
		System.out.println("Area of Circle is "+area);
		System.out.println("Perimeter of Circle is "+perimeter);
		
	}

}
