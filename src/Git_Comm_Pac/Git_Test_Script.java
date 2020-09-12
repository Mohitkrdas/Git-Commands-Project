package Git_Comm_Pac;

import java.util.Scanner;

public class Git_Test_Script
{
	public static void main(String [] args)
	{
		
		String initial_String;
		String reverse_String="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		
		initial_String=scan.nextLine();
		int length=initial_String.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse_String=reverse_String+initial_String.charAt(i);
		}
		  
		System.out.println("Reversed string: "+reverse_String);
  
 System.out.println("added");
  
	}
}
