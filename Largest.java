import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int large=n1;
		if(n2>large)
		large=n2;
		else if(n3>large)
		large=n3;
		System.out.println("large number is:"+large);
		
	}
}