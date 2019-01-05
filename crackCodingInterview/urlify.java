import java.util.*;
public class urlify
{
    public static void urlify(char[] str, int numChar)
    {
    	int temp = 0;
    	for(int i = 0; i < str.length; i++)
    	{
    		temp = i + 1;
    		if(temp > numChar)
    		{
    			System.out.println("hi");
    		}
    	}
	
    }
    public static void main(String[] args)
    {
    	String a = "Mr John Smith       ";
    	char[] b = a.toCharArray();
        urlify(b,13);
    }
}