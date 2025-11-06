public class ArtBook extends Book {

    public ArtBook() {
        super();
    }

    public ArtBook(String t, String i, String p, int y) {
        super(t, i, p, y);
    }

    public void setPrice(double p) {
        setPriceValue(p);
    }

    public String getGenre() {
        return "Art";
    }

    public String showInfo() {
        return displayBookInfo() + "\nGenre: " + getGenre() + "\nPrice: " + getPriceValue();
    }
}
