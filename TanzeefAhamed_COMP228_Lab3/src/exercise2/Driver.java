package exercise2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first tester's name: ");
        String firstName = input.nextLine();

        System.out.print("Is the first tester Full-Time or Part-Time? ");
        String firstType = input.nextLine();

        GameTester firstTester;
        if (firstType.equalsIgnoreCase("full-time")) {
            firstTester = new FullTimeTester(firstName);
        } else {
            System.out.print("Enter how many hours the first tester worked: ");
            int firstHours = Integer.parseInt(input.nextLine());
            firstTester = new PartTimeTester(firstName, firstHours);
        }

        System.out.println();

        System.out.print("Enter the second tester's name: ");
        String secondName = input.nextLine();

        System.out.print("Is the second tester Full-Time or Part-Time? ");
        String secondType = input.nextLine();

        GameTester secondTester;
        if (secondType.equalsIgnoreCase("full-time")) {
            secondTester = new FullTimeTester(secondName);
        } else {
            System.out.print("Enter how many hours the second tester worked: ");
            int secondHours = Integer.parseInt(input.nextLine());
            secondTester = new PartTimeTester(secondName, secondHours);
        }

        System.out.println();
        System.out.println("Tester Details:");
        System.out.println(firstTester.showInfo());
        System.out.println(secondTester.showInfo());

        System.out.println("<-----Program written by: Tanzeef Ahamed----->");

        input.close();
    }
}
