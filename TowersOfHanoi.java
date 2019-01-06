/**
 * Created by Shreyas on 3/28/17.
 */
import java.util.*;
public class TowersOfHanoi {
  int x = 1;
    public void Hanoi(int num, String init, String a, String fin){
        if(num == 1){
        System.out.println("Step:"+ x++ +" Disk:"+ num +"  InitialTower:"+ init +"  FinalTower:"+ fin);
        }
        else{
        Hanoi(num - 1,init,fin,a);
        System.out.println("Step:"+ x++ +" Disk:"+ num +"  InitialTower:"+ init +"  FinalTower:"+ fin);
        Hanoi(num - 1,a,init,fin);
        }
        }

public static void main(String[] args){
    TowersOfHanoi T = new TowersOfHanoi();
    System.out.print("How many discs do you want to have(No more than 6)?  ");
    Scanner s = new Scanner(System.in);
    int d = s.nextInt();

    System.out.print("Initial State in tower A: ");
    for (int j = d; j>0; j--){
        System.out.print(j + " ");
    }
    System.out.println();
    T.Hanoi(d, "A", "B", "C");
}
}



