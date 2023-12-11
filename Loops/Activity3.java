/*Part 3: For loops
Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String*/

package Loops;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
			
	}

}
