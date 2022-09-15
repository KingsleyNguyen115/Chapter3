/**
 * Class: WeekDay
 * author: Kingsley Nguyen
 * version 1.0
 * course: ITEC 2140 Fall 2022
 * written: Sep 15 2022
 * this class: ask user enter the input and generate the output weekday or weekend
 */
import java.util.Scanner;
public class WeekDay {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an int number between 1 to 7: ");
        int num = input.nextInt();

        if ( num == 1 || num == 2 || num ==3 || num == 4|| num == 5){
            System.out.println("Week day");
        }
        else if (num == 6 || num == 7){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Invalid entries");
        }
    }
}
