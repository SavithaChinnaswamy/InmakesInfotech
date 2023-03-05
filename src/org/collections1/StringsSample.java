package org.collections1;


public class StringsSample 
{
	public static void main(String[] args) 
	{
		String s = "savitha chinnaswamy";
		
		//to find particular character by using index
		
		char ch = s.charAt(5);
		System.out.println(ch);
	
		//to convert strings to uppercase
		
		String UC = s.toUpperCase();
		System.out.println(UC);
		
		//to convert strings to lowercase
		
		String LC = s.toLowerCase();
		System.out.println(LC);
		
		//to check whether the string is empty or not
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		//to check whether the string starts with particular value or not
		
		boolean starts = s.startsWith("sav");
		System.out.println(starts);
		
		//to check whether the string ends with particular value or not
		
		boolean endsWith = s.endsWith("amy");
		System.out.println(endsWith);
		
		//to check whether the string contains particluar value or not
		
		boolean contains = s.contains("chinna");
		System.out.println(contains);
		
		//to check the length of string
		
		int length = s.length();
		System.out.println(length);
		
		//to replace one character in the string
		
		String replace = s.replace("n", "N");
		System.out.println(replace);
		
		//to replace all character
		
		String replaceAll = s.replace("savi", "Kani");
		System.out.println(replaceAll);
		
		//to replace all the occurrence of word or character
		
		String replace2= s.replaceAll(s,"waiting");
		System.out.println(replace2);
		
		//to find the index of particular value
		
		int index = s.indexOf("a");
		System.out.println(index);
		
		//to find the index of particular value(last value)
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		//to remove the space before and after string
		
		String c = " K A N I ";
		String trim = c.trim();
		System.out.println(trim);
		
		//to remove the space between the all words
		
	   String replace3 = c.replace(" ", "");
	   System.out.println(replace3);
	   
	   //to start with and ends with particular index
	   
	   String substring = s.substring(1, 7);
	   System.out.println(substring);
	   
	   //to compare two values 
	   
	   String S1 = "Su";
	   String S2 = "dharshan";
	   
	   boolean equals = S1.equals(S2);
	   System.out.println(equals);
	   
	   //to join two strings
	   
	   String concat = S1.concat(S2);
	   System.out.println(concat);
			   
       
	}	
	
	
	
	
}

