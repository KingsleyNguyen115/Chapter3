/** Class: Random
 * author: Kingsley Nguyen
 * Version 1.0
 * course : ITEC 2140 Fall 2022
 * Written: Sep 13 2022
 * This class: generate the random number from 0 to 10, then ask the user to guess.
 *
 */
import java.util.Scanner;
public class Random {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int number: ");
        int num = input.nextInt();

        int rand = (int)(Math.random() * 11);

        if ( num == rand){
            System.out.println("Hooray you guessed the number.");

        }
        else{
            System.out.println("You lost !!");
        }
    }
}
