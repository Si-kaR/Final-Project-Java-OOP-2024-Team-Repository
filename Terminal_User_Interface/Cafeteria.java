import java.util.ArrayList;
import java.util.List;

/**
 * The Cafeteria class represents a cafeteria that provides meals and drinks to customers.
 * It contains attributes for the cafeteria's name, location, and menus, as well as a list of orders.
 */
public class Cafeteria {
    private String cafeteriaName;

    private List<Order> orders; // List of orders in the cafeteria
    private List<FoodItem> mealsMenu; // List of meals available in the cafeteria
    private String location;
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

    public void displayMealsMenu() {
        int i = 1;
        System.out.println(cafeteriaName + "'s Meals Menu:");
        for (FoodItem meal : mealsMenu) {
            System.out.println(i+ ": " + meal.getName() + " GHC " + meal.getPrice());
            i++;
        }
    }


    /**
     * Notifies the cafeteria with a message (e.g., order details).
     *
     * @param notification the notification message for the cafeteria
     */
    public void getNotificationCafeteria(String notification) {
        System.out.println("Notification for " + cafeteriaName + ": " + notification);
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
