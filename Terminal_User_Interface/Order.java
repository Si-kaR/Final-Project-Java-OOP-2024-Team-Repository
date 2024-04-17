
public class Order {
    private Customer user;
    private Cafeteria cafeteria;
    private FoodItem foodItem;
    private static double totalPrice;

    // Constructors
    public Order(Customer user, Cafeteria cafeteria, FoodItem foodItem) {
        this.user = user;
        this.cafeteria = cafeteria;
        this.foodItem = foodItem;
        this.totalPrice = foodItem.getPrice();
    }
    
    

    public void displayOrderDetails(){
        System.out.println("\nYour order details are listed below ---------------------------\n");
        System.out.println(" Customer name:" + user.getName() + 
                           "\n UserID: " + user.getUserId() + 
                           "\n Order: " + foodItem.getName() + " GHC " + foodItem.getPrice() +
                           "\n Cafeteria: " + cafeteria.getCafeteriaName() +
                           "\n DropOff location: " + user.getHostel());
    }
    
    public void addItem(FoodItem foodItem) {
        // Adding a new food item to the customer's order
        // Implementing this method based on your previous Classes requirements
    }

    public void removeItem(FoodItem foodItem) {
        // This is to remove food(s) item from the order
        // Implementing this method based on your previous Classes  requirements
    }

    public static double getPrice()
    {
        return totalPrice;
    }

}
