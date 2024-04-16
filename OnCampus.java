/**
 * OnCampus class that models the on campus cafeteria. 
 * It extends to the cafeteria class to provide the menu for 
 * ordering to the customer and gives them the opportunity
 * to place order in any instantiated object of the on campus class.
 * @author Group 9 Object Oriented Programming final project
 * 
 */
public class OnCampus extends Cafeteria {
    private String cafeteriaName;
    private String mealName;
    private String drinkName;
    private double mealPrice;
    private double drinkPrice;
    private int mealPlanCard;
    private int cardPin;

    /**
     * 
     * @param cafeteriaName
     * @param mealName
     * @param drinkName
     * @param mealPrice
     * @param drinkPrice
     */
    public OnCampus(String cafeteriaName, String mealName, String drinkName,double mealPrice, double drinkPrice){
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
    public OnCampus(String cafeteriaName,String mealName, double mealPrice){
        this(cafeteriaName, mealName, none, mealPrice, 0);
    }

    /**
     * 
     * @return String
     */
    public String getCafeteriaName(){
        return cafeteriaName;
    }

    /**
     * 
     * @param NameOfCafe
     */
    public void setCafeteriaName(String NameOfCafe){
        cafeteriaName = NameOfCafe;
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
     * @param NameOfMeal
     */
    public void setMealName(String NameOfMeal){
        mealName = NameOfMeal;
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
     * @param NameOfDrink
     */
    public void setDrinkName(String NameOfDrink){
        drinkName = NameOfDrink;
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
     * @param priceOfMeal
     */
    public void setMealPrice(double priceOfMeal){
        mealPrice = priceOfMeal;
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
     * @param priceOfDrink
     */
    public void setDrinkPrice(double priceOfDrink){
        drinkPrice = priceOfDrink;
    }

    /**
     * 
     * @return int
     */
    public int getMealPlanCard(){
        return mealPlanCard;
    }

    /**
     * 
     * @param MealCard
     */
    public void setMealPlanCard(int MealCard){
        mealPlanCard = MealCard;
    }

    /**
     * 
     * @return int
     */
    public int getCardPin(){
        return cardPin;
    }

    /**
     * 
     * @param pinForCard
     */
    public void setCardPin(int pinForCard){
        cardPin = pinForCard;
    }

    /**
     * 
     * @param mealPlanCard
     * @param cardPin
     * @return boolean
     */
    public boolean mealPlan(int mealPlanCard, int cardPin){
        this.mealPlanCard = mealPlanCard;
        this.cardPin = cardPin;
        return true;

    }

    /**
     * 
     * @param meal
     */
    public void addMeal(string meal){
        for (int i =0; i<super.mealsMenu.length; i++){
            if ((super.mealsMenu[i]).equals(meal)){
                System.out.println("Meal already on the menu"); 
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
            if ((super.drinksMenu)[i].equals(meal)){
                System.out.println("Drink already on the menu"); 
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
    public String toString(){
        return ("Name: " + getMealName() + ", price: " + getMealPrice());
    }
}