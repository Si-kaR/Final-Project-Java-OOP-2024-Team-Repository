public class FoodItem {
    private String name; // Name of the food item
    private String description; // Description of the food item
    private double price; // Price of the food item
    private Cafeteria cafeteria; // Reference to a Cafeteria object

    // Constructor to initialize a FoodItem object
    public FoodItem(String name, String description, double price, Cafeteria cafeteria) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cafeteria = cafeteria;
    }

    // Method to get the price of the food item
    public double getPrice() {
        return price;
    }

    // Method to get the name of the food item
    public String getName() {
        return name;
    }

    // Getters and setters for the other attributes

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    // Method to display the details of the food item
    public void displayFoodItemDetails() {
        System.out.println("Food Item Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Served at: " + cafeteria.getCafeteriaName());
    }
}
