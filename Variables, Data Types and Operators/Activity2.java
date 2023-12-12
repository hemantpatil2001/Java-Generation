/*Activity 2: My First Variable Naming
Open your IntelliJ Idea IDE and follow the instructions below
Create a project called MyFirstVariableNaming
Create a class titled "UserProfile"
Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
Use the age to calculate the year when a user was born.
Print the values back to a user's console.
Extra features
If you're able to implement the steps above with time to spare, add the following features to your app.

Instead of storing values in the static variables (variables manually assigned to values), have it so that a few variables are entered by a user through the console.*/

package Github_Variables;
import java.util.Scanner;
public class Activity2 {

	public static void main(String[] args) 
	{
		
		String users_name;
		int age,birthyear;
	    String gender;
	    String job_preference;
	    String nationality;
	    String blood_type;
	   
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter your name : "); 
	   users_name=sc.next();
	   System.out.println("Enter your Birth Year : "); 
	   birthyear=sc.nextInt();
	   System.out.println("Enter your Gender : "); 
	   gender = sc.next();
	   System.out.println("Enter your Job Preference : "); 
	   job_preference= sc.next();
	   System.out.println("Enter your Nationality : "); 
	   nationality = sc.next();
	   System.out.println("Enter your Blood Group : ");
	   blood_type = sc.next();
	   
	   age= 2023 - birthyear;
	   System.out.println("=========== All Data ==========");
	   System.out.println("Name : "+users_name); 
	   System.out.println("Age : "+age); 
	   System.out.println("Gender : "+gender); 
	   System.out.println("Job Preference : "+job_preference); 
	   System.out.println("Nationality : "+nationality);
	   System.out.println("Blood Group : "+blood_type); 
	   
	   
	   
	   
	   
	   }

}
