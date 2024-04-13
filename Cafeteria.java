import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cafeteria {
    private String cafeteriaName;
    private List[orders] orders; // For the Order class    private List<String> drinksMenu;
    private List<String> mealsMenu;
    private String location; // Either "onCampus" or "offCampus"
    private static List<Cafeteria> cafeteriaList = new ArrayList<>(); // List of cafeterias

    // Constructor to initialize the Cafeteria object
    public Cafeteria(String cafeteriaName, String location) {
        this.cafeteriaName = cafeteriaName;
        this.location = location;
        this.orders = new ArrayList<>();
        this.drinksMenu = new ArrayList<>();
        this.mealsMenu = new ArrayList<>();
        // Add this cafeteria to the cafeteria list
        cafeteriaList.add(this);
    }

    // Method to add a meal to the meals menu
    public void addMeal(String meal) {
        mealsMenu.add(meal);
        System.out.println("Added meal: " + meal + " to the meals menu.");
    }

    // Method to add a drink to the drinks menu
    public void addDrink(String drink) {
        drinksMenu.add(drink);
        System.out.println("Added drink: " + drink + " to the drinks menu.");
    }

    // Method to remove a drink from the drinks menu
    public boolean removeDrink(String drink) {
        boolean removed = drinksMenu.remove(drink);
        if (removed) {
            System.out.println("Removed drink: " + drink + " from the drinks menu.");
        } else {
            System.out.println("Drink: " + drink + " not found in the drinks menu.");
        }
        return removed;
    }

    // Method to display the meals menu
    public void displayMealsMenu() {
        System.out.println("Meals Menu:");
        for (String meal : mealsMenu) {
            System.out.println("- " + meal);
        }
    }

    // Method to display the drinks menu
    public void displayDrinksMenu() {
        System.out.println("Drinks Menu:");
        for (String drink : drinksMenu) {
            System.out.println("- " + drink);
        }
    }

    // Method to get the full menu (meals and drinks)
    public void getMenu() {
        System.out.println("Full Menu:");
        displayMealsMenu();
        displayDrinksMenu();
    }

    // Method to notify the cafeteria with a message (e.g., order details)
    public void getNotificationCafeteria(String notification) {
        System.out.println("Notification for " + cafeteriaName + ": " + notification);
    }

    // Getters and setters for the attributes

    public String getCafeteriaName() {
        return cafeteriaName;
    }

    public void setCafeteriaName(String cafeteriaName) {
        this.cafeteriaName = cafeteriaName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<String> getDrinksMenu() {
        return drinksMenu;
    }

    public void setDrinksMenu(List<String> drinksMenu) {
        this.drinksMenu = drinksMenu;
    }

    public List<String> getMealsMenu() {
        return mealsMenu;
    }

    public void setMealsMenu(List<String> mealsMenu) {
        this.mealsMenu = mealsMenu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<Cafeteria> getCafeteriaList() {
        return cafeteriaList;
    }
}
