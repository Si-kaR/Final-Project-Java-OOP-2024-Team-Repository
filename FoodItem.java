// // /**
//  * The FoodItem class represents a food item that is served in a cafeteria.
//  * It contains attributes for the food item's name, description, price, and a reference to the cafeteria.
//  */
public class FoodItem {
    private String name; // Name of the food item
    private String description; // Description of the food item
    private double price; // Price of the food item
    private Cafeteria cafeteria; // Reference to a Cafeteria object

    /**
     * Constructs a new FoodItem object with the specified name, description, price, and cafeteria reference.
     *
     * @param name the name of the food item
     * @param description the description of the food item
     * @param price the price of the food item
     * @param cafeteria the cafeteria where the food item is served
     */
    public FoodItem(String name, String description, double price, Cafeteria cafeteria) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cafeteria = cafeteria;
    }

    /**
     * Retrieves the price of the food item.
     *
     * @return the price of the food item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the name of the food item.
     *
     * @return the name of the food item
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the description of the food item.
     *
     * @return the description of the food item
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the food item.
     *
     * @param description the description to set for the food item
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the cafeteria where the food item is served.
     *
     * @return the cafeteria where the food item is served
     */
    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    /**
     * Sets the cafeteria where the food item is served.
     *
     * @param cafeteria the cafeteria to set for the food item
     */
    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    /**
     * Displays the details of the food item, including name, description, price, and the cafeteria where it is served.
     */
    public void displayFoodItemDetails() {
        System.out.println("Food Item Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Served at: " + cafeteria.getCafeteriaName());
    }
}
