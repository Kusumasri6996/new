
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfNaturalNumbersFor
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum+=i;
	}
	System.out.println("the sum of natural numbers till n is:"+sum);
	}
}