import java.util.Scanner;

public class MidtermDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("|| Enter Science Book details ||");
        System.out.print("Title: ");
        String sciTitle = input.nextLine();

        System.out.print("ISBN: ");
        String sciIsbn = input.nextLine();

        System.out.print("Publisher: ");
        String sciPublisher = input.nextLine();

        System.out.print("Year: ");
        int sciYear = Integer.parseInt(input.nextLine());

        System.out.print("Base Price (before discount Only Number): ");
        double sciBasePrice = Double.parseDouble(input.nextLine());

        ScienceBook science = new ScienceBook(sciTitle, sciIsbn, sciPublisher, sciYear);
        science.setPrice(sciBasePrice);

        System.out.println();
        System.out.println("|| Enter Art Book details ||");
        System.out.print("Title: ");
        String artTitle = input.nextLine();

        System.out.print("ISBN: ");
        String artIsbn = input.nextLine();

        System.out.print("Publisher: ");
        String artPublisher = input.nextLine();

        System.out.print("Year: ");
        int artYear = Integer.parseInt(input.nextLine());

        System.out.print("Price(Only Number): ");
        double artPrice = Double.parseDouble(input.nextLine());

        ArtBook art = new ArtBook(artTitle, artIsbn, artPublisher, artYear);
        art.setPrice(artPrice);

        System.out.println();
        System.out.println("---- Science Book Information ----");
        System.out.println(science.showInfo());

        System.out.println();
        System.out.println("---- Art Book Information ----");
        System.out.println(art.showInfo());

        System.out.println();
        System.out.println("<-----Mid-Term Test COMP 228 008 Fall-2025 by: Tanzeef Ahamed ----->");

        input.close();
    }
}
