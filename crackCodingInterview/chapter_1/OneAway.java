import java.util.*;

public class OneAway {
    public static Boolean OneAway(String one,String two){
        if(one.length() == two.length()){
            //if equal length check if there is exactly one different
            Boolean Difference = false;
            for(int i = 0;i < one.length();i++){
                if(one.charAt(i) != two.charAt(i)){
                    if(Difference){
                        return(false);
                    }
                    Difference = true;
                }
            }
            return(true);
        }else if(Math.abs(one.length()-two.length()) == 1){
            //string two will always be greater
            String temp = "";
            if(one.length() > two.length()){
                temp = one;
                one = two;
                two = temp;
            }
            int i1 = 0;
            int i2 = 0;
            while(i1 < one.length() && i2 < two.length()){
                if(one.charAt(i1) != two.charAt(i2)){
                    if(i1 != i2){
                        return(false);
                    }
                    i2++;
                }else{
                    i1++;
                    i2++;
                }
            }
            return(true);
        }
        return(false);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word1");
        String one = scan.nextLine();
        System.out.println("Please enter word2");
        String two = scan.nextLine();
        Boolean oneAway = OneAway(one,two);
        System.out.println(one + " and " + two + " is " + oneAway);
    } 
}