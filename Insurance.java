/**
 * class: Car Insurance
 * author: Kingsley Nguyen
 * version 1.0
 * course: ITEC 2140 Fall 2022
 * Written : sep 15 2022
 * this class: calculate the car insurance cost.
 */
import java.util.Scanner;
public class Insurance {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double baseCost = 300.0;

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your number of car accidents: ");
        int accidents = input.nextInt();

        if (age < 27){
            double ageCost = baseCost + 100;
            if(accidents == 1){
                double finalCost = ageCost + 100;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if (accidents == 2){
                double finalCost = ageCost + 150;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if (accidents == 3){
                double finalCost = ageCost + 250;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if(accidents >= 4){
                double finalCost = ageCost + 1000;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else{
                double finalCost = ageCost;

            System.out.println("Your car insurance cost is: " + finalCost);}
        }
        else {
            double ageCost = baseCost;
            if (accidents == 1) {
                double finalCost = ageCost + 100;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if (accidents == 2){
                double finalCost = ageCost + 150;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if (accidents == 3){
                double finalCost = ageCost + 250;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else if(accidents >= 4){
                double finalCost = ageCost + 1000;
                System.out.println("Your car insurance cost is: " + finalCost);
            }
            else{
                double finalCost = ageCost;

                System.out.println("Your car insurance cost is: " + finalCost);}
        }


    }
}
