import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * The Cafeteria class represents a cafeteria that provides meals and drinks to customers.
 * It contains attributes for the cafeteria's name, location, and menus, as well as a list of orders.
 */
public class Cafeteria {
    private String cafeteriaName;

    private List<Order> orders; // List of orders in the cafeteria
    // private List<String> drinksMenu; // List of drinks available in the cafeteria
    private List<FoodItem> mealsMenu; // List of meals available in the cafeteria
    private String location; // Location of the cafeteria ("onCampus" or "offCampus")
    private static List<Cafeteria> cafeteriaList = new ArrayList<>(); // List of all cafeterias

    /**
     * Constructs a new Cafeteria object with the specified name and location.
     *
     * @param cafeteriaName the name of the cafeteria
     * @param location the location of the cafeteria (either "onCampus" or "offCampus")
     */
    public Cafeteria(String cafeteriaName, String location) {
        this.cafeteriaName = cafeteriaName;
        this.location = location;
        this.orders = new ArrayList<>();
        // this.drinksMenu = new ArrayList<>();
        this.mealsMenu = new ArrayList<>();
        // Add this cafeteria to the cafeteria list
        cafeteriaList.add(this);
    }

    /**
     * Adds a meal to the meals menu.
     *
     * @param meal the meal to be added to the meals menu
     */
    public void addMeal(FoodItem meal) {
        mealsMenu.add(meal);
    }

    /**
     * Adds a drink to the drinks menu.
     *
     * @param drink the drink to be added to the drinks menu
     */

     /** 
    public void addDrink(String drink) {
        drinksMenu.add(drink);
        JOptionPane.showMessageDialog(null, "Added drink: " + drink + " to the drinks menu.");
    }*/

    /**
     * Removes a drink from the drinks menu.
     *
     * @param drink the drink to be removed from the drinks menu
     * @return true if the drink was removed; false otherwise
     
    public boolean removeDrink(String drink) {
        boolean removed = drinksMenu.remove(drink);
        if (removed) {
            JOptionPane.showMessageDialog(null, "Removed drink: " + drink + " from the drinks menu.");
        } else {
            JOptionPane.showMessageDialog(null, "Drink: " + drink + " not found in the drinks menu.");
        }
        return removed;
    }
*/
    /**
     * Displays the meals menu.
     */
    public void displayMealsMenu() {
        int i = 1;
        JOptionPane.showMessageDialog(null, cafeteriaName + "'s Meals Menu:");
        for (FoodItem meal : mealsMenu) {
            JOptionPane.showMessageDialog(null, i+ ": " + meal.getName() + " GHC " + meal.getPrice());
            i++;
        }
    }

    /**
     * Displays the drinks menu.
     
    public void displayDrinksMenu() {
        JOptionPane.showMessageDialog(null, "Drinks Menu:");
        for (String drink : drinksMenu) {
            JOptionPane.showMessageDialog(null, "- " + drink);
        }
    }
*/
    /**
     * Displays the full menu (meals and drinks).
     
    public void getMenu() {
        JOptionPane.showMessageDialog(null, "Full Menu:");
        displayMealsMenu();
        displayDrinksMenu();
        // Since this is a get method it should RETURN
        
    }
*/
    //  Use toString for displayMealsMenu


    // Use toString for displayDrinksMenu


// Prototype
// Prototype
// Prototype
// Prototype
// Prototype
// Prototype
// Prototype
// Prototype

















    /**
     * Notifies the cafeteria with a message (e.g., order details).
     *
     * @param notification the notification message for the cafeteria
     */
    public void getNotificationCafeteria(String notification) {
        JOptionPane.showMessageDialog(null, "Notification for " + cafeteriaName + ": " + notification);
    }

    // Getters and setters for the attributes

    /**
     * Retrieves the name of the cafeteria.
     *
     * @return the name of the cafeteria
     */
    public String getCafeteriaName() {
        return cafeteriaName;
    }

    /**
     * Sets the name of the cafeteria.
     *
     * @param cafeteriaName the name of the cafeteria
     */
    public void setCafeteriaName(String cafeteriaName) {
        this.cafeteriaName = cafeteriaName;
    }

    /**
     * Retrieves the list of orders in the cafeteria.
     *
     * @return the list of orders in the cafeteria
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Sets the list of orders in the cafeteria.
     *
     * @param orders the list of orders to set in the cafeteria
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Retrieves the list of drinks available in the cafeteria.
     *
     * @return the list of drinks available in the cafeteria
    
    public List<String> getDrinksMenu() {
        return drinksMenu;
    }
 */
    /**
     * Sets the list of drinks available in the cafeteria.
     *
     * @param drinksMenu the list of drinks to set
    
    public void setDrinksMenu(List<String> drinksMenu) {
        this.drinksMenu = drinksMenu;
    }
 */
    /**
     * Retrieves the list of meals available in the cafeteria.
     *
     * @return the list of meals available in the cafeteria
     */
    public List<FoodItem> getMealsMenu() {
        return mealsMenu;
    }

    /**
     * Sets the list of meals available in the cafeteria.
     *
     * @param mealsMenu the list of meals to set
     */
    public void setMealsMenu(List<FoodItem> mealsMenu) {
        this.mealsMenu = mealsMenu;
    }

    /**
     * Retrieves the location of the cafeteria.
     *
     * @return the location of the cafeteria (either "onCampus" or "offCampus")
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the cafeteria.
     *
     * @param location the location to set ("onCampus" or "offCampus")
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Retrieves the list of all cafeterias.
     *
     * @return the list of all cafeterias
     */
    public static List<Cafeteria> getCafeteriaList() {
        return cafeteriaList;
    }
}
