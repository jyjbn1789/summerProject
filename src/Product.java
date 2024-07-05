public class Product extends Menu {
    double price;

    public Product(String name, double price, String description) {
        super(name, description);
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + price + "원) | " + description;
    }
}
