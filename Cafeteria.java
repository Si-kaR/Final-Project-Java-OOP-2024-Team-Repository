Class: Cafeteria

Attribute:
    CafeteriaName: String
    Orders: order[]
    drinksMenu: String[]
    mealsMenu: String[]
    CafeteriaList
    Location (onCampus / offCampus)

Method:
    +addMeal(meal: String): void
    +addDrink(drink: String): void
    +removeDrink(drink: String):boolean
    +displayMealsMenu(): void
    +displayDrinksMenu(): void
    getMenu()
    getNotificationCafeteria(“Order Details”)
