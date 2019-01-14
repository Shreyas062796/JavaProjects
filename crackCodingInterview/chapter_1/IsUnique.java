import java.util.*;
public class IsUnique{
    public static boolean isUnique(String s){
	boolean Unique = false;
	for(int i = 0; i < s.length(); i++){
	    for(int j = 0; j < s.length(); j++){
		if(j != i){
		    if(s.charAt(i) == s.charAt(j) && i != j){
			return false;
		    }
		}
	    }
	}
	return true;
    }

    public static void main(String[] args)
    {
	if(isUnique(args[0]) == true)
	    {
		System.out.println("The string is unique");
	    }
	else
	    {
		System.out.println("The string is not unique");
	    }
    }
}