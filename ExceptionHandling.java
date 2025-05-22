/* To Handle all exceptions in single program 
using command line arguments  21-12-2021 */

import java.util.*;
import java.lang.*;
class ExceptionHandling
{
    public static void main(String args[])
    {
	try
	{
	  int a,c,d,x;	
	  
	  // ArithmeticException  
	  a = Integer.parseInt(args[0]);
	  x = 36/a;
	  System.out.println("Division result is : "+x);
	 
	  // ArrayIndexOutOfBoundsException
	  int b[] = new int[10];
	  b[a] = Integer.parseInt(args[1]);
	  System.out.println("Element in array : "+b[a]);

	  // NumberFormatException
	  c = Integer.parseInt(args[2]);
	  System.out.println("Given number is : " +c);

	  // StringIndexOutOfBoundsException 
	  System.out.println("Charecter at 5th index is : "+args[3].charAt(5));

	  // NullPointerException
	  if(args[3].length() < 10)
	  {		
		String s = null;
		System.out.println("Length of string is : " +s.length());
	  }
	  else
	  {
		System.out.println("Given string is : " +args[3]);
	  }
	}
	catch(ArithmeticException e1)
	{
	    System.out.println(e1);
 	}
	catch(ArrayIndexOutOfBoundsException e2)
	{
	    System.out.println(e2);
 	}
	catch(NumberFormatException e3)
	{
	    System.out.println(e3);
 	}
	catch(StringIndexOutOfBoundsException e4)
	{
	    System.out.println(e4);
	}	
	catch(NullPointerException e5)
	{
	    System.out.println(e5);
 	}
    }
}

