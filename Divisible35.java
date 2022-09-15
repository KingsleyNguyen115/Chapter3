/**
 * Class: Divisible 35
 * author: Kingsley Nguyen
 * version 1.0
 * written: Sep 14 2022
 * course ITEC 2140 Fall 2022
 * this class: prompt the user enter a number that divisible by 3 or 5
 */

import java.util.Scanner;

public class Divisible35{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number: ");

        int num = input.nextInt();

        if(num % 3 == 0 && num % 5 ==0){
            System.out.println("the number is a multiple of 3 and a multiple of 5");
        }
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("The number is a multiple of either 3 or 5");

        }
        if (3%num == 0 || 5% num ==0){
            System.out.println("The number is divisible by either 3 or 5 but not both");
        }
    }
}

