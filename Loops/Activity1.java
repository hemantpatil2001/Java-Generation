/*Part 1: While loops
Open your IDE and create a new Java class named Table
Copy the following code into your Java class Table and verify it works
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	    }
	}
Implement a while loop that prints out the multiplication table of the given input number.
*/

package Loops;
import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
        int num,i=1,mul=0;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        
        System.out.println("Multiplication Table of " + num);
        while(i<=10)
        {
        	
        	System.out.println(num*i);
        	i++;
        	
        }
	}

}
