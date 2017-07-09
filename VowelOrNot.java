import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VowelOrNot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		char alpha=s.next().charAt(0);
	switch(alpha)
{	case 'a':
		case 'e':
			case 'i':
				case 'o':
					case 'u':
						
		System.out.println("vowel");
		break;
		default:
		System.out.println("consonent");
}
}
}