package exercise3;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current prime interest rate (example: 0.05 for 5%): ");
        double primeRate = Double.parseDouble(input.nextLine());

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println();
            System.out.println("Enter details for Mortgage #" + (i + 1));

            System.out.print("Enter the mortgage type (Business or Personal): ");
            String type = input.nextLine();

            System.out.print("Enter the mortgage number: ");
            String number = input.nextLine();

            System.out.print("Enter the customer name: ");
            String name = input.nextLine();

            System.out.print("Enter the mortgage amount: ");
            double amount = Double.parseDouble(input.nextLine());

            System.out.print("Enter the term in years (1, 3, or 5): ");
            int term = Integer.parseInt(input.nextLine());

            if (type.equalsIgnoreCase("business")) {
                mortgages[i] = new BusinessMortgage(number, name, amount, primeRate, term);
            } else {
                mortgages[i] = new PersonalMortgage(number, name, amount, primeRate, term);
            }
        }

        System.out.println();
        System.out.println("---- Mortgage Details ----");
        for (Mortgage m : mortgages) {
            System.out.println(m.getMortgageInfo());
            System.out.println("---------------------------");
        }

        System.out.println("<-----Program written by: Tanzeef Ahamed----->");

        input.close();
    }
}
