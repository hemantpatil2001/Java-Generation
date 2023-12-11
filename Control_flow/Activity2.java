/*A movie cinema does price discounting depending on a customer's age.
The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
Age range	Ticket Price
Normal ticket	7 Euros
Below 5	60% Discount
Over 60	55% Discount
Write the app so that the conditions above are met and the correct ticket price is returned.*/

package Control_flow;
import java.util.Scanner;
public class Activity2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		float euro=7;
		if(age >5 && age <=60)
		{
			System.out.println("You are eligible for normal ticket only, you have to pay : "+euro+" Euros");
		}
		else if(age <=5)
		{
			System.out.println("You are eligible for 60% discount, You Have to pay : "+((euro/100)*60)+" Euros");
		}
		else if(age>60)
		{
			System.out.println("You are eligible for 55% discount, You Have to pay : "+((euro/100)*60)+" Euros");
		}

	}

}
