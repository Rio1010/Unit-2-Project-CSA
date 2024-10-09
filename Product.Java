public class Product {
    protected String name;
    protected double price;
    protected int quantity;  

    // Default constructor
    public Product() {
        this.name = "Unknown Product";
        this.price = 0.0;
        this.quantity = 0;  
    }

    // Parameterized constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;  
    }

    // Accessor of name, price, and qntty
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    /*
     * mutator of name, price, and qntty
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}