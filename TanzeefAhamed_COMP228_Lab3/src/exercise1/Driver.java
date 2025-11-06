package exercise1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first insurance type (Health or Life): ");
        String firstType = input.nextLine();

        Insurance firstInsurance;
        if (firstType.equalsIgnoreCase("health")) {
            firstInsurance = new Health();
            firstInsurance.setInsuranceCost();
        } else {
            firstInsurance = new Life();
            firstInsurance.setInsuranceCost();
        }

        System.out.print("Enter your second insurance type (Health or Life): ");
        String secondType = input.nextLine();

        Insurance secondInsurance;
        if (secondType.equalsIgnoreCase("health")) {
            secondInsurance = new Health();
            secondInsurance.setInsuranceCost();
        } else {
            secondInsurance = new Life();
            secondInsurance.setInsuranceCost();
        }

        System.out.println();
        System.out.println("Insurance Details:");
        System.out.println(firstInsurance.displayInfo());
        System.out.println(secondInsurance.displayInfo());

        System.out.println("<-----Program written by: Tanzeef Ahamed----->");

        input.close();
    }
}
