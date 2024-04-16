import java.util.Date;

public class Order {
    private int orderId;
    private Customer user;
    private Cafeteria cafeteria;
    private FoodItem[] foodItems;
    private String status;
    private double totalPrice;
    private String destination;
    private String paymentMethod;
    private Date timestamp;

    // Constructors
    public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem) {
        this.user = user;
        this.cafeteria = cafeteria;
        this.foodItems = new FoodItem[]{foodItem};
        this.status = "Pending";
        this.totalPrice = foodItem.getPrice();
        this.destination = "";
        this.paymentMethod = "";
        this.timestamp = new Date();
    }

    public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem, String destination) {
        this(user, cafeteria, foodItem);
        this.destination = destination;
    }

    public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem, String destination, String paymentMethod) {
        this(user, cafeteria, foodItem, destination);
        this.paymentMethod = paymentMethod;
    }

    public Order() {
        // I think this should be the default constructor for the Order class
    }

    public void addItem(FoodItem foodItem) {
        // Adding a new food item to the customer's order
        // Implementing this method based on your previous Classes requirements
    }

    public void removeItem(FoodItem foodItem) {
        // This is to remove food(s) item from the order
        // Implementing this method based on your previous Classes  requirements
    }

    public double calculatePrice() {
        // Calculating the total price of the order(s)
        // You can implementing this method based on your related classes requirements
        return totalPrice;
    }

    public boolean updateStatus() {
        // Update the status of the order
        if (newStatus.equals("Pending") || newStatus.equals("Ready")) {
            this.status = newStatus;
            return true;
        } else {
            return false;
        }
    }
}
