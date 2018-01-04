import java.util.*;
public class IsUnique
{

    public static boolean isUnique(String s)
    {
	boolean Unique = false;
	//char[] letters = s.toCharArray();
	for(int i = 0; i < s.length()-1; i++)
	    {
		for(int j = 0; j < s.length()-1; j++)
		    {
			if(j != i)
			    {
				if(s.charAt(i) != s.charAt(j))
				    {
					Unique = true;
				    }
				else
				    {
					Unique = false;
					break;
				    }
			    }
		    }
		    }
		return Unique;
	    }

    public static void main(String[] args)
    {
	if(isUnique("hello") == true)
	    {
		System.out.println("The string is unique");
	    }
	else
	    {
		System.out.println("The string is not unique");
	    }
    }
}