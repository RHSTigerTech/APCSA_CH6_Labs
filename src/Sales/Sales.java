package Sales;
/**
 * Name:
 * Date:
 * Period:
 *
 * Sales.Sales.java
 *
 * Reads in and stores sales for each of 5 salespeople.  Displays
 * sales entered by salesperson id and total sales for all salespeople.
 */
import sun.jvm.hotspot.oops.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        //TODO 4) Prompt the user for the number of sales people that they need to enter
        //TODO 4) and modify the program to create an appropriately sized array.

        
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }
        //print the array for verification
        //System.out.println(Arrays.toString(sales));

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + i + "\t\t\t" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);


        //TODO 1b) Use your average method to print the average sales


        //TODO 2b) Use your indexOfMax method to print the index of the best sales person
        //TODO 2b) and the sales amount for that sales person.


        //TODO 3b) Do the same for the worst sales person



    }

    public static double average(int[] arr) throws IllegalStateException
    {
        //TODO 1a) compute and return the average of arr
        //Be sure to use the length instance variable and you may assume that the array is full.
        //If the array does not have at least 1 element in it, throw an IllegalStateException

        return 0;
    }

    public static int indexOfMax(int[] arr)
    {
        //TODO 2a) find and return the index of the max value in arr

        return 0;
    }

    //TODO 3a) Do the same for an indexOfMin method


}
