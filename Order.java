//import java.util.Date;

public class Order {
    // private int orderId;
    private Customer user;
    private Cafeteria cafeteria;
    private FoodItem foodItem;
    // private String status;
    private static double totalPrice;
    // private String paymentMethod;
    // private java.util.Date timestamp;

    // Constructors
    public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem) {
        this.user = user;
        this.cafeteria = cafeteria;
        this.foodItem = foodItem;
        // this.status = "Pending";
        this.totalPrice = foodItem.getPrice();
        //this.paymentMethod = "";
        //this.timestamp = new Date();
    }
    
    //public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem, String destination, String paymentMethod) {
        //this(user, cafeteria, foodItem, destination);
        //this.paymentMethod = paymentMethod;}
    

    public void displayOrderDetails(){
        System.out.println("\nYou order details are listed below ");
        System.out.println("Customer name:" + user.getName() + 
                           "\nUserID: " + user.getUserId() + 
                           "\nOrder: " + foodItem.getName() + " GHC " + foodItem.getPrice() +
                           "\nCafeteria: " + cafeteria.getCafeteriaName() +
                           "\nDropOff location: " + user.getHostel());
    }
    
    public void addItem(FoodItem foodItem) {
        // Adding a new food item to the customer's order
        // Implementing this method based on your previous Classes requirements
    }

    public void removeItem(FoodItem foodItem) {
        // This is to remove food(s) item from the order
        // Implementing this method based on your previous Classes  requirements
    }

    // public double calculatePrice() {
    //     // Calculating the total price of the order(s)
    //     // You can implementing this method based on your related classes requirements
    //     return totalPrice;
    // }

    public static double getPrice()
    {
        return totalPrice;
    }

}
