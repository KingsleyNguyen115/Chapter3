/**
 * Class: Number
 * author: Kingsley Nguyen
 * version 1.0
 * course ITEC 2140 Fall 2022
 * written: Sep 13 2022
 * This class: generate the class that read the largest int number from user inputs.
 */
import java.util.Scanner;
public class Number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 1st int number: ");
        int num1st = input.nextInt();

        System.out.println("Enter your 2nd int number: ");
        int num2nd = input.nextInt();

        System.out.println("Enter your 3rd int number: ");
        int num3rd = input.nextInt();

        if(num1st >= num2nd & num1st >= num3rd){
            System.out.print(num1st);
        }
        if( num2nd >= num1st & num2nd >= num3rd){
            System.out.println(num2nd);
        }
        if(num3rd >= num1st & num3rd >= num2nd){
            System.out.println(num3rd);
        }
    }
}
