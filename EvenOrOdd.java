import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenOrOdd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("write a number");
	int n=s.nextInt();
	if(n%2==0)
	System.out.println("even");
	else
	System.out.println("odd");
	}
}