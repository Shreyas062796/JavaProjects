import java.util.*;
public class checkPermutation
{
    public static boolean checkPerm(String one, String two)
    {
	char[] a = one.toCharArray();
	char[] b = two.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	return(Arrays.equals(a,b));
    }
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	String paramOne = scan.nextLine();
	String paramTwo = scan.nextLine();
	if(checkPerm(paramOne,paramTwo) == true)
	    {
		System.out.println("The two strings are permutations of eachother");
	    }
	else
	    {
		System.out.println("The two strings are not permutations of eachother");
	    }
    }
}