import java.util.*;

public class stringCompression {
    public static String compress(String input) {
        StringBuilder string = new StringBuilder();
        int count = 0;
        //build the compressed string as you iterate through input string
        for(int i = 0;i < input.length();i++) {
            count++;
            if(i+1 >= input.length() || input.charAt(i) != input.charAt(i+1)) {
                string.append(input.charAt(i));
                string.append(count);
                count = 0;
            }
        }
        //check if string is greater than input and if it is then dont print it
        if(string.length() > input.length()){
            return(input);
        }
        return(string.toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word to compress");
        String input = scan.nextLine();
        System.out.println("Compressed string: " + compress(input));
    }
}