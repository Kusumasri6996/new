
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckNumberPositiveOrNegative
{
public static void main(String[] args)
{
	 Scanner s= new Scanner(System.in);
   System.out.println("enter a number");
    int n=s.nextInt();
    if(n>0)
      System.out.println("positive");
    else if(n<0)
      System.out.println("negative");
      else
    System.out.println("zero");	// your code goes here
 
	}
}