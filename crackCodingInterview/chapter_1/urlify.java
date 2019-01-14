import java.util.*;
public class urlify
{
    public static char[] urlify(char[] str, int numChar){
    	int spaces = 0;
    	for(int i=0;i<numChar;i++){
		if(str[i] == ' '){
		spaces++;
	}
	}
	System.out.println(spaces);
	int idx = numChar + spaces*2-1;
	for(int i=numChar-1;i>0;i--){
		if(str[i] == ' '){
			str[idx] = '0';
			str[idx-1] = '2';
			str[idx-2] = '%';
			idx -= 3;
		}
		else{
			str[idx] = str[i];
			idx--;
		}
	}
	return(str);
 	}   
public static void main(String[] args)
    {
    	String a = "Mr John Smith    ";
    	char[] b = a.toCharArray();
        char[] x = urlify(b,13);
    	System.out.println(x);
	}
}
