public class ScienceBook extends Book {

    public ScienceBook() {
        super();
    }

    public ScienceBook(String t, String i, String p, int y) {
        super(t, i, p, y);
    }

    public void setPrice(double p) {
        double finalPrice = p * 0.85;
        setPriceValue(finalPrice);
    }

    public String getGenre() {
        return "Science";
    }

    public String showInfo() {
        return displayBookInfo() + "\nGenre: " + getGenre() + "\nPrice: " + getPriceValue();
    }
}
