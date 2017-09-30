import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {

        int[] array1 = new int[32];
        Populate(array1);

        System.out.println("Unsorted Average Case:");
        PrintArray(array1);


        System.out.println("Sorted Average Case: ");
        int[] arr1 = InsertionSort(array1);
        PrintArray(arr1);


        int[] best = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
        System.out.println("Unsorted Best Case: ");
        PrintArray(best);


        System.out.println("Sorted Best Case: ");
        int[] array2 = InsertionSort(best);

        PrintArray(array2);



        int[] Worst = {32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        System.out.println("Unsorted Worst Case: ");
        PrintArray(Worst);



        System.out.println("Sorted Worst Case: ");
        int[] array4 = InsertionSort(Worst);
        PrintArray(array4);

        int[] hundred = new int[100];
        Populate(hundred);



        System.out.println("Unsorted Average case for n = 100");
        PrintArray(hundred);



        System.out.println("Sorted Average Case for n = 100: ");
        int[] hundred1 = InsertionSort(hundred);
        PrintArray(hundred1);



        int[] thousand = new int[1000];
        Populate(thousand);


        System.out.println("Unsorted Average case for n = 1000");
        PrintArray(thousand);


        System.out.println("sorted Average Case for n = 1000: ");
        int[] thousand1 = InsertionSort(thousand);
        PrintArray(thousand1);



        int[] tentho = new int[10000];
        Populate(tentho);



        System.out.println("Average case for n = 10000");
        PrintArray(tentho);


        System.out.println("Sorted Average Case for n = 10000: ");
        int[] tentho1 = InsertionSort(tentho);
        PrintArray(tentho1);


    }

    public static int[] InsertionSort(int[] array) {
        int compct = 0;
        int temp;
        for (int a = 1; a < array.length; a++) {
            int j=a;
            while(j>0 && array[j] < array[j-1]){
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j=j-1;
                compct++;
            }

        }
        System.out.println("Number of Key comparisons: " + compct);
        return array;
    }
    public static void PrintArray(int[] arr)
    {
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
        }

        System.out.println("\n");
    }
    public static int[] Populate(int[] arr)
    {
        Random generate = new Random();
        int Number;
        for(int t=0;t<arr.length;t++){
            Number = generate.nextInt(100);

            arr[t] = Number;
        }
        return arr;

    }

}
