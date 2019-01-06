import java.util.*;
public class checkPermutation
{
	//helper function to get number of occurences
    public static int Occurences(String str, char c){
	int count = 0;
	for(int x = 0; x < str.length();x++){
		if(str.charAt(x) == c){
			count++;
		}
    }
		return(count);
    }

    public static boolean checkPerm(String one, String two){
		if(one.length() != two.length()){
			return false;
		}
		for(int i = 0;i < one.length();i++){
		 		if(Occurences(one,one.charAt(i)) != Occurences(two,one.charAt(i))){
					 return(false);
				 }
			}
		return(true);
    }

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the first word that you want to use?");
		String paramOne = scan.nextLine();
		System.out.println("what is the second word that you want to use?");
		String paramTwo = scan.nextLine();
		if(checkPerm(paramOne,paramTwo) == true){
			System.out.println("The two strings are permutations of eachother");
	    }
		else{
			System.out.println("The two strings are not permutations of eachother");
	    }
    }
}
