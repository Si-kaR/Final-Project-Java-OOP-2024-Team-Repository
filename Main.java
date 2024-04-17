import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        // This operation is reserved for the restaurants and school officials 
        // Create cafeteria
        Cafeteria cafeteria1 = createCafeteria("Munchies", "OnCampus");
        Cafeteria cafeteria2 = createCafeteria("Akorno", "OffCampus");


        // Our ordering platform 
        JOptionPane.showMessageDialog(null, "Hello there! \nWelcome to the Ashesi Ordering platform!\n");
        Scanner keyboard = new Scanner(System.in);
        
        // set up user details
        Customer user1 = createUser();
        JOptionPane.showMessageDialog(null, "Order Your Meal");
        
       

        // Prompt the user to select a restaurant
        String optionStr = JOptionPane.showInputDialog(null, "Select restaurants\n1 - " + cafeteria1.getCafeteriaName() + "\n2 - " + cafeteria2.getCafeteriaName());

        // Convert the input to an integer
        int option = Integer.parseInt(optionStr);

        // Check the user's choice and proceed with the corresponding cafeteria
        if (option == 1) {
            // Display cafeteria1 details (optional, adjust as needed)
            JOptionPane.showMessageDialog(null, "You selected: " + cafeteria1.getCafeteriaName());
            // Proceed with making an order for cafeteria1
            makeOrder(user1, cafeteria1);
        } else if (option == 2) {
            // Display cafeteria2 details (optional, adjust as needed)
            JOptionPane.showMessageDialog(null, "You selected: " + cafeteria2.getCafeteriaName());
            // Proceed with making an order for cafeteria2
            makeOrder(user1, cafeteria2);
        } else {
            // Handle invalid option
            JOptionPane.showMessageDialog(null, "Invalid option selected. Please select 1 or 2.");
        }


    }
    public static Cafeteria createCafeteria(String name, String location){
        Cafeteria cafeteria1 = new Cafeteria(name, location);
        FoodItem food1 = new FoodItem("pizza", "flat", 10);
        FoodItem food2 = new FoodItem("waakye", "brown", 20);
        FoodItem food3 = new FoodItem("plantain", "banana", 30);
        cafeteria1.addMeal(food1);
        cafeteria1.addMeal(food2);
        cafeteria1.addMeal(food3);
        return cafeteria1;

    }


    public static Customer createUser() {
        boolean validInput = false;
        int userID = 0;
        String name = null;
        int contactID = 0;
        String hostel = null;
        int roomNo = 0;
    
        while (!validInput) {
            try {
                name = JOptionPane.showInputDialog("Please enter your details below \nCustomer Name: ");
                if (name == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(null, "Operation cancelled by the user.");
                    return null;
                }
    
                // Prompt for userID and parse it to integer
                String userIdInput = JOptionPane.showInputDialog("Hi " + name + ", Enter your UserID: ");
                if (userIdInput == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(null, "Operation cancelled by the user.");
                    return null;
                }
                userID = Integer.parseInt(userIdInput);
    
                // Prompt for contactID and parse it to integer
                String contactIdInput = JOptionPane.showInputDialog("ContactID: ");
                if (contactIdInput == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(null, "Operation cancelled by the user.");
                    return null;
                }
                contactID = Integer.parseInt(contactIdInput);
    
                // Prompt for hostel
                hostel = JOptionPane.showInputDialog("Hostel (Type only the first word): ");
                if (hostel == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(null, "Operation cancelled by the user.");
                    return null;
                }
    
                // Prompt for room number and parse it to integer
                String roomNoInput = JOptionPane.showInputDialog("Room number: ");
                if (roomNoInput == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(null, "Operation cancelled by the user.");
                    return null;
                }
                roomNo = Integer.parseInt(roomNoInput);
    
                validInput = true;
    
            } catch (NumberFormatException e) {
                // Handle invalid number inputs
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers for UserID, ContactID, and Room number.");
            }
        }
    
        // Create and return the Customer instance
        Customer customer = new Customer(userID, name, contactID, hostel, roomNo);
        return customer;
    }


    public static void makeOrder(Customer user, Cafeteria cafeteria){
        boolean validInput = false;
        do 
        {
            try
            {
                // Display the meals menu in a single dialog box using JOptionPane.showMessageDialog()
                StringBuilder mealsMenu = new StringBuilder();
                for (int i = 0; i < cafeteria.getMealsMenu().size(); i++) {
                    FoodItem foodItem = cafeteria.getMealsMenu().get(i);
                    mealsMenu.append(i + 1)
                            .append(" - ")
                            .append(foodItem.getName())
                            .append(" (")
                            .append(foodItem.getPrice())
                            .append(" GHC)")
                            .append("\n");
                }
                JOptionPane.showMessageDialog(null, "Meals Menu:\n" + mealsMenu.toString());
                
                // Prompt the user to enter the number of the meal they want to order
                String input = JOptionPane.showInputDialog(null, "\nWhat would you like to eat? Please type in the number: ");
                int orderno = Integer.parseInt(input);
                validInput = true;
    
                // Create an order based on the user's choice
                Order order = new Order(user, cafeteria, cafeteria.getMealsMenu().get(orderno - 1));
                order.displayOrderDetails();
    
                // Initiate the game or other operations
                Scanner scannerInput = new Scanner(System.in);
                initiateGame(scannerInput);
            } 
            catch (InputMismatchException e) 
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number to select the meal.");
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number to select the meal.");
            }
    
        } while (!validInput);
    }
    
/**
 * 
 * @param questions
 * @param answers
 * @param input
 * @return
 */
    public static int playGame(String[] questions, char[] answers, Scanner input) {
        int totalPoints = 0;
        for (int i = 0; i < questions.length; i++) {
            JOptionPane.showMessageDialog(null, questions[i]);
            
            // Prompt the user for a response and validate it
            String userResponse = JOptionPane.showInputDialog(null, "Please respond with A or B: ");
            
            // Handle potential null input
            if (userResponse == null) {
                JOptionPane.showMessageDialog(null, "You cancelled the quiz.");
                break;
            }
    
            // Convert the input to uppercase
            userResponse = userResponse.trim().toUpperCase();
            
            // Validate the response
            if (!userResponse.equals("A") && !userResponse.equals("B")) {
                JOptionPane.showMessageDialog(null, "Invalid response. Please enter either A or B.");
                i--; // Re-ask the same question
                continue;
            }
    
            // Check if the user's response matches the correct answer
            char answer = userResponse.charAt(0);
            if (answer == answers[i]) {
                totalPoints += 100;
            } else {
                JOptionPane.showMessageDialog(null, "The correct answer is " + answers[i]);
            }
        }
        return totalPoints;
    }
    
    

  /**
   * 
   * @param input
   */
    public static void initiateGame(Scanner input)
{
    JOptionPane.showMessageDialog(null, "Welcome to the Climate change quiz game. \nHere we test your understanding of the climate by giving you a short article to read, after which you answer a few questions based on it.");
    // Prompt the user to enter 'y' or 'n'
    String userInput = JOptionPane.showInputDialog(null, "To Proceed \nEnter [y] for (yes) | [n] for (no): ");
    
    // Check if the input is not empty
    if (userInput != null && !userInput.trim().isEmpty()) {
        // Convert the input to lowercase and get the first character
        char userResponse = userInput.toLowerCase().charAt(0);
        
        // If user enters 'y', proceed with the quiz
        if (userResponse == 'y') {
            String countryChoice = getCountry(input);
            
            // Keep prompting the user for a valid country choice until they provide one
            while (!checkValidInputCountry(countryChoice)) {
                countryChoice = getCountry(input);
            }
            
            JOptionPane.showMessageDialog(null, "\n....We would like to test your knowledge on the article you just read");
            JOptionPane.showMessageDialog(null, "Press Enter to begin the quiz");
            
            // Wait for the user to press Enter
            // input.nextLine();
            
            // Start displaying the questions
            displayQuestions(countryChoice, input);
        } else if (userResponse == 'n') {
            // If user enters 'n', display the action plan
            JOptionPane.showMessageDialog(null, "..................");
            displayActionPlan();
        } else {
            // Handle invalid input
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter 'y' for yes or 'n' for no.");
            initiateGame(input); // Retry
        }
    } else {
        // Handle empty input
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter 'y' for yes or 'n' for no.");
        initiateGame(input); // Retry
    }
}


    /**
     * This method gets the choice of country the user would want to learn about
     * @param input
     * @return
     */
    public static String getCountry(Scanner input)
    {
        String countryChoice = JOptionPane.showInputDialog(null, "We have three articles\nEnter Ghana to increase your knowledge on climate change in Ghana\nEnter Nigeria to increase your knowledge on climate change in Nigeria\nEnter General Knowledge to increase your knowledge on the nature of climate in the world.\n");
        // String countryChoice = input.nextLine();
        return countryChoice;
    }
    
 
    /**
     * This method validates the country provided by the user
     * @param country The country choice provided by the user
     * @return true if the country is valid, false otherwise
     */
    public static boolean checkValidInputCountry(String country) {
        if (country.equalsIgnoreCase("Ghana") || country.equalsIgnoreCase("Nigeria") || country.equalsIgnoreCase("General Knowledge")) {
            // Display the article based on the user's country choice
            Article.displayArticle(country);
            return true;
        } else {
            // Provide instructions for entering a valid country choice
            JOptionPane.showInputDialog(null, "\nInvalid choice. Please enter Ghana, Nigeria, or General Knowledge.");
            return false;
        }
    }


    /**
     * This method displays the questions and it's associated answers for the user to play the game
     * @param countryChoice
     * @param input
     */
    public static void displayQuestions(String countryChoice, Scanner input)
    {
        if (countryChoice.equalsIgnoreCase("Ghana"))
        {
            // JOptionPane.showMessageDialog(null, );
            QuestionsGhana ghanaQuestions = new QuestionsGhana();
            int result = playGame(ghanaQuestions.getQuestions(), ghanaQuestions.getAnswers(), input);
            displayPointsAccumulated(result);
            getDiscount(result);

        }

        else if (countryChoice.equalsIgnoreCase("Nigeria"))
        {
            // JOptionPane.showMessageDialog(null, );
            QuestionsNigeria nigeriaQuestions = new QuestionsNigeria();
            int result = playGame(nigeriaQuestions.getQuestions(), nigeriaQuestions.getAnswers(), input);
            displayPointsAccumulated(result);
            getDiscount(result);
        }

        else if (countryChoice.equalsIgnoreCase("General Knowledge"))
        {
            // JOptionPane.showMessageDialog(null, );
            GeneralKnowledge generalKnowledge = new GeneralKnowledge();
            int result = playGame(generalKnowledge.getQuestions(), generalKnowledge.getAnswers(), input);
            displayPointsAccumulated(result);
            getDiscount(result);
        }
        displayActionPlan();
    }


    public static void getDiscount(int result)
    {
        if (result >=400)
        {
            JOptionPane.showMessageDialog(null, "\n\nCongratulations... Your account has been credited with GHC " + Order.getPrice() * 0.1 + "\n\n");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "You scored less than 400 points. Play and learn about the climate on your next order");
        }
    }

    /**
     * This method displays the total points accumulated from the quiz
     * @param result
     */
    public static void displayPointsAccumulated(int result)
    {
        JOptionPane.showMessageDialog(null, "....................You scored " + result +" / 500 points...................." + "\n");
    }

    /*This method displays the action Plan for users consumption */
    public static void displayActionPlan()
    {
        
        try
            {
               File actionPlan = new File("ActionPlanAgainstClimateChange.txt");
               Scanner myScanner = new Scanner(actionPlan);
               while (myScanner.hasNextLine())
               {
                    String data = myScanner.nextLine();
                    JOptionPane.showMessageDialog(null, data);
               }
               myScanner.close();
            } catch (FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(null, "An error occured");
                e.printStackTrace();
            }

    }


  
}