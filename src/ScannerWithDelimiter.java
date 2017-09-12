/**
 * @author Andres Montenegro
 * Date: 9/12/2017
 * Contact: am23828@email.vccs.edu
 * Purpose: Find the average of 10 numbers from user input using comma "," as a delimiter.
 */

import java.util.Scanner;

public class ScannerWithDelimiter {
    public static void main(String[] args){
        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum,avg; //assigns variables for the numbers
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(","); // "," will now be used to tell the program when each number is entered
        System.out.println("\'" + "Enter 10 numbers to find the avergae of using commas to seperate them" + "\'");
        num1 = Integer.parseInt(keyboard.next()); //Allows the program to undertsand variables through keyboard
        num2 = Integer.parseInt(keyboard.next());
        num3 = Integer.parseInt(keyboard.next());
        num4 = Integer.parseInt(keyboard.next());
        num5 = Integer.parseInt(keyboard.next());
        num6 = Integer.parseInt(keyboard.next());
        num7 = Integer.parseInt(keyboard.next());
        num8 = Integer.parseInt(keyboard.next());
        num9 = Integer.parseInt(keyboard.next());
        num10 = Integer.parseInt(keyboard.next());
        sum = ( num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10); //sums together all the variables
        avg = (sum/10); //finds the avergae of the variables
        System.out.println("The average is " + "\t" + avg);
    }
}
