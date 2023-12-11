/*Part 1: Class Grader
Open IntelliJ Idea App and create a project called ClassGrader
Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
Failed if they scored 3 or less
Insufficient if they scored > 3 but less than 5. (5 included)
Good if they scored > 5 but less than 8. (8 included)
Excellent Grade if they scored 10.
if participants enter a negative number or a number outside the range supported (outside 0 - 10)*/

package Logic_Operators_Github;
import java.util.Scanner;
public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade between 0 to 10 : ");
		int num= sc.nextInt();
		
		if(num <= 3 && num>0)
		{
			System.out.println("Grade : Failed");
		}
		else if(num > 3 && num<5 )
		{
			System.out.println("Grade : Insufficient");
		}
		else if(num > 5 && num <8)
		{
			System.out.println("Grade : Good");
		}
		else if(num>8 && num <=10)
		{
			System.out.println("Grade : Excellent");
		}
		else
		{
			System.out.println("Invalid Grade");
		}
	}

}
