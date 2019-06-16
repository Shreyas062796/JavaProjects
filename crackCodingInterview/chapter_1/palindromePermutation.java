import java.util.*;
public class palindromePermutation{

    public static Boolean checkPalPerm(String input){
        //A set of characters can form a palindrome if at most one character occurs odd number of
        //times and all characters occur even number of times
        int count = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0;i < input.length();i++){
		   if(map.containsKey(input.charAt(i))){
			map.put(input.charAt(i),map.get(input.charAt(i))+1);
		   }else{
			map.put(input.charAt(i),1);
		}
		}
		for(char key:map.keySet()){
			if(map.get(key) % 2 == 1){				
				count++;
			}
		}
		return(count <= 1);
    }


    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word to check if its a palindrome");
		String word = scan.nextLine();
		Boolean x = checkPalPerm(word);
		System.out.println(x);
    }
}
