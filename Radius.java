/**Class: Radius
 * author: Kingsley Nguyen
 * Version 1.0
 * Course: ITEC 2140 Fall 2022
 * written: SEP 13 2022
 * This Class: ask user enter a positive radius number then calculate the area of circle
 *
 *
 */
import java.util.Scanner;
public class Radius {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter a positive number for your radius: ");
       double radius = input.nextDouble();

       if ( radius > 0){
           double circleArea = Math.PI * radius * radius;
           System.out.println("The calculated value of the circle area is: " + circleArea);
       }
       else{
           System.out.println("Invalid Entry");
       }
   }
}
