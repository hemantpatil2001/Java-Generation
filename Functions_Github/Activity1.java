/*Download the project and import it into IntelliJ Idea
Implement the following functions:
    private static void printNameLength( String name )
    {
      //TODO implement this code
    }

    private static void printNameCharacters( String name )
    {
      //TODO implement this code
    }
Test your code with 5 different names and verify that the behaviour is correct.
Modify your code to also capture from the user the last name.
Implement an additional function that prints the FUll name of the person.
*/

package Functions_Github;
import java.util.Scanner;
public class Activity1 {
	private static void printNameLength( String name )
    {
      //TODO implement this code
		System.out.println("Length : "+name.length());
    }

    private static void printNameCharacters( String name )
    {
    	for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String str=sc.next();
		
		Activity1 obj = new Activity1();
		obj.printNameCharacters(str);
		obj.printNameLength(str);

	}

}
