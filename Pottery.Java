public class Pottery extends Product {
    /*
     * Constructors
     */ 
    public Pottery() {
        super("Pottery Supplies", 0.0, 0);  
    }

    public Pottery(String name, double price, int quantity) {
        super(name, price, quantity); 
    }

    // toString method
    public String toString() {
        return super.toString();
    }
}