import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner s=new Scanner(System.in);
     int y=s.nextInt();
     if(y%4==0)
     System.out.println("leap year");
     else
     System.out.println("not a leap year");
	}
}