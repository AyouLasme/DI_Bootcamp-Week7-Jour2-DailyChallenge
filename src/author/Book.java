package author;

public class Book{

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    /*A toString()qui renvoie « 'nom-du-livre' par nom-auteur (sexe)
    dans l'e-mail ». Vous pouvez réutiliser la méthode toString() de
    l'auteur, qui renvoie « nom-auteur (sexe) à l'adresse e-mail ».*/

    public String toString() {
        return name + " par " + (author.toString()) + " dans " + author.getEmail() ;
    }
}
