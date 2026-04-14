public class Book extends Product {
    private String author;

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        setAuthor(author);
    }

    public Book(int id, String name, double price) {
        super(id, name, price);
        setAuthor(null);
    }

    public void setAuthor(String author) {
        if(author == null || author.isEmpty()) {
            System.out.println("Author name cannot be empty.");
            this.author = "Unknown";
        } else {
            this.author = author;
        }
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName() + ": " + getPrice() + "€ - Author: " + author;  
    }
}
