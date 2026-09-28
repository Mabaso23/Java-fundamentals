package Chapter1;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double adultPrice = 50.00;
        double childPrice = 37.50;

        System.out.print("Enter the number of adult meals: ");
        int adultMeals = input.nextInt();

        System.out.print("Enter the number of child meals: ");
        int childMeals = input.nextInt();

        double adultTotal = adultMeals * adultPrice;
        double childTotal = childMeals * childPrice;
        double total = adultTotal + childTotal;

        System.out.println("Adult meals collected: R"+ adultTotal);
        System.out.println("Child meals collected: R"+ childTotal);
        System.out.println("=====================================");
        System.out.println("Total money calculated: R"+ total);


    }
}
