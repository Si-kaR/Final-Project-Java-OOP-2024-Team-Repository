/**
 * OffCampus class that models the off campus cafeteria. 
 * It extends to the cafeteria class to provide the menu for 
 * ordering to the customer and gives them the opportunity
 * to place order in any instantiated object of the off campus class.
 * @author Group 9 Object Oriented Programming final project
 * 
 */
public class OffCampus extends Cafeteria {

    private String cafeteriaName;
    private String mealName;
    private String drinkName;
    private double mealPrice;
    private double drinkPrice;

    /**
     * 
     * @param cafeteriaName
     * @param mealName
     * @param drinkName
     * @param mealPrice
     * @param drinkPrice
     */
    public OffCampus(String cafeteriaName, String mealName, String drinkName,double mealPrice, double drinkPrice){
        this.cafeteriaName = cafeteriaName;
        this.mealName = mealName;
        this.drinkName = drinkName;
        this.mealPrice = mealPrice;
        this.drinkPrice = drinkPrice;

    }

    /**
     * 
     * @param cafeteriaName
     * @param mealName
     * @param mealPrice
     */
    public OffCampus(String cafeteriaName,String mealName, double mealPrice){
        this(cafeteriaName, mealName, none, mealPrice, 0);
    }
   // public OffCampus(String cafeteriaName,String drinkName, double drinkPrice){
      //  this(cafeteriaName, null, drinkName, 0, drinkPrice);
   // }

    /**
     * 
     * @return String
     */
    public String getCafeteriaName(){
        return cafeteriaName;
    }

    /**
     * 
     * @return String
     */
    public String getMealName(){
        return mealName;
    }

    /**
     * 
     * @return String
     */
    public String getDrinkName(){
        return drinkName;
    }

    /**
     * 
     * @return double
     */
    public double getMealPrice(){
        return "\u20B5" + mealPrice;
    }

    /**
     * 
     * @return double
     */
    public double getDrinkPrice(){
        return "\u20B5" + drinkPrice;
    }

    /**
     * 
     * @param meal
     */
    public void addMeal(string meal){
        for (int i =0; i<super.mealsMenu.length; i++){
            if ((super.mealsMenu[i]).equals(meal)){
                System.out.println("Meal is already on the menu"); 
            }
            else {
                (super.mealsMenu).add(meal);
            }
        }
    }

    /**
     * 
     * @param drink
     */
    public void addDrink(string drink){
        for (int i =0; i<(super.drinksMenu).length; i++){
            if ((super.drinksMenu)[i].equals(drink)){
                System.out.println("Drink is already on the menu."); 
            }
            else {
                (super.drinksMenu).add(drink);
            }
        }
    }
    
    /**
     * 
     * @param drink
     * @return boolean
     */
    public boolean removeDrink(string drink){
        for (int i = 0; i<(super.drinksMenu).length; i++){
            if ((super.drinksMenu)[i].equals(drink)){
                (super.drinksMenu).remove(Integer.valueOf(drink));
                System.out.println("Drink removal was successful"); 
                return true;
            }
            else {
                System.out.println("Drink removal was unsuccessful, because drink is not on the menu. "); 
            }
        }
    }

    public void displayMeal(){
        System.out.println("This is the menu for " + getCafeteriaName() + " Cafeteria");
        System.out.println("Meal: " + mealName + "  =>   Price: " + mealPrice);
    }

    @Override
    public String toString() {
        return ("Name: " + getMealName() + ", price: " + getMealPrice());
      }

}