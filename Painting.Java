public class Painting extends Product {
    private String color;

    // Constructors
    public Painting() {
        super("Painting Supplies", 0, 0); 
        this.color = "No Color";
    }

    public Painting(String name, double price, String color, int quantity) {
        super(name, price, quantity); 
        this.color = color;
    }

    /*
     * Accessor and Mutator methods for color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}