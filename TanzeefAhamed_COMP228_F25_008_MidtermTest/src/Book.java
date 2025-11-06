public abstract class Book {
    private String title;
    private String isbn;
    private String publisher;
    private double price;
    private int year;

    public Book() {
        title = "";
        isbn = "";
        publisher = "";
        price = 0.0;
        year = 0;
    }

    public Book(String t, String i, String p, int y) {
        title = t;
        isbn = i;
        publisher = p;
        price = 0.0;
        year = y;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String i) {
        isbn = i;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    protected void setPriceValue(double p) {
        price = p;
    }

    public double getPriceValue() {
        return price;
    }

    public abstract void setPrice(double p);
    public abstract String getGenre();

    public String displayBookInfo() {
        return "Title: " + title + "\nISBN: " + isbn + "\nPublisher: " + publisher + "\nYear: " + year;
    }
}
