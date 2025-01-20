public class Product {

        // Instance Variables
        private String productName;
        private double price;

        // Class Variable
        private static int totalProducts = 0;

        // Constructor to initialize product details
        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++; // Increment the totalProducts count when a new product is created
        }

        // Instance method to display product details
        public void displayProductDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
        }

        // Class method to display the total number of products
        public static void displayTotalProducts() {
            System.out.println("Total Products: " + totalProducts);
        }

        // Main method for testing
        public static void main(String[] args) {
            // Creating product objects
            Product product1 = new Product("Laptop", 999.99);
            Product product2 = new Product("Smartphone", 799.99);

            // Display individual product details
            product1.displayProductDetails();
            product2.displayProductDetails();

            // Display total number of products
            Product.displayTotalProducts();
        }
    }


