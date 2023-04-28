package MavenProject.MavenJava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String val="Hello"; char arr[]=val.toCharArray(); for(int
		 * i=0;i<=val.length()-1;i++) { System.out.print(arr[i]);
		 * 
		 * 
		 * } System.out.println("");
		 * 
		 * for(int j=val.length()-1;j>=0;j--) { System.out.print(arr[j]); }
		 * 
		 */
		
		palindrome();
		
	}
	
	public static void palindrome()
	{
		String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }  
		
	}


