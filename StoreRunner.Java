import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueShopping = true;

        System.out.println("Hello, welcome to the art shop! What can I get for you?");
        
        while (continueShopping) {
            System.out.println("1. Paint supplies\n2. Pottery supplies");
            int choice = input.nextInt();
            
            Product product = null;
            
            if (choice == 1) {
                System.out.println("Paint supplies: \n1. Canvas \n2. Paint brushes \n3. Colors");
                int paintChoice = input.nextInt();

                if (paintChoice == 1) {
                    System.out.println("How many?");
                    int quantity = input.nextInt();
                    product = new Painting("Canvas", 10.0, "N/A", quantity);
                    System.out.println(quantity + " canvas added to cart.");
                } else if (paintChoice == 2) {
                    System.out.println("How many?");
                    int quantity = input.nextInt();
                    product = new Painting("Paint brushes", 5.0, "N/A", quantity);
                    System.out.println(quantity + " paint brushes added to cart.");
                } else if (paintChoice == 3) {
                    System.out.println("What color?");
                    String color = input.next();
                    System.out.println("How many?");
                    int quantity = input.nextInt();
                    product = new Painting("Colors", 3.0, color, quantity);
                    System.out.println(quantity + " " + color + " color added to cart.");
                }
            } else if (choice == 2) {
                System.out.println("Pottery supplies \n1. Clay \n2. Sculpting tools set");
                int potteryChoice = input.nextInt();

                if (potteryChoice == 1) {
                    System.out.println("How many?");
                    int quantity = input.nextInt();
                    product = new Pottery("Clay", 20.0, quantity);
                    System.out.println(quantity + " clay added to cart.");
                } else if (potteryChoice == 2) {
                    System.out.println("How many?");
                    int quantity = input.nextInt();
                    product = new Pottery("Sculpting tools set", 15.0, quantity);
                    System.out.println(quantity + " sculpting tools set added to cart.");
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            if (product != null) {
                System.out.println("You've chosen: " + product.toString());
            }

            System.out.println("Do you want anything else? (Y/N)");
            String response = input.next();

             if (response.toLowerCase().equals("y")) {
                continueShopping = true;  // Continue shopping
            } else if (response.toLowerCase().equals("n")) {
                continueShopping = false;  // End the shopping loop
                System.out.println("Thank you for shopping!");
            } else {
                System.out.println("Invalid response. Ending shopping.");
                continueShopping = false;
            }
        }//while loop
    }//end of static void
}//end of class
