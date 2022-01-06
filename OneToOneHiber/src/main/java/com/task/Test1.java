package com.task;
public class Test1 { 
	
	public static void test(String str)
	{ int check = 5; 
	if (check ==str.length()) 
	{ check =check - 1;
	System.out.print(str.charAt(check) +" ,"); 
	} 
	else 
	{ 
		System.out.print(str.charAt(1) + ", "); 
		} }
	public static void main(String argv[]){ 
		
		  test("hello"); 
		test("date"); 
		test("chek");
		}
}