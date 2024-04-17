//import java.util.Date;
import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "\nYou order details are listed below ");        

        // System.out.println("\nYou order details are listed below ");
        JOptionPane.showMessageDialog(null, "Customer name: " + user.getName() + 
                           "\nUserID: " + user.getUserId() + 
                           "\nOrder: " + foodItem.getName() + "\nCost: GHC " + foodItem.getPrice() +
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

   

    public static double getPrice()
    {
        return totalPrice;
    }

}
