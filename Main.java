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
        JOptionPane.showMessageDialog(null, "\n\n---------------------------------------------------------------\nHello there! Welcome to the Ashesi Ordering platform!\n---------------------------------------------------------------");
        Scanner keyboard = new Scanner(System.in);
        
        // set up user details
        Customer user1 = createUser();
        JOptionPane.showMessageDialog(null, "Order you food now");
        
        JOptionPane.showMessageDialog(null, "---------------------------------------------------------------\nSelect restaurants\n1 - " + cafeteria1.getCafeteriaName() + "\n2 - " + cafeteria2.getCafeteriaName());
        int option = keyboard.nextInt();
            if (option == 1)
                makeOrder(user1, cafeteria1);
            else 
                makeOrder(user1, cafeteria2); 
        //else if (choice == 2);
            //learnClimateChange();
            //takeQuiz();
        

        // display outcome and total points earned if any. 

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
    // Create a user
    public static Customer createUser(){
        boolean validInput = false;
        int userID = 0;
        String name = null;
        int contactID = 0;
        String hostel = null;
        int roomNo = 0;
        do
        {
            try 
            {
                Scanner keyboard = new Scanner(System.in);
                JOptionPane.showInputDialog(null, "Please enter your details below \nCustomer Name: ");
                // name = keyboard.nextLine();
                JOptionPane.showInputDialog(null, "UserID: ");
                // userID = keyboard.nextInt();
                JOptionPane.showInputDialog(null, "ContactID: ");
                // contactID = keyboard.nextInt();
                JOptionPane.showInputDialog(null, "Hostel(Type only the first word): ");
                // hostel = keyboard.next();
                JOptionPane.showInputDialog(null, "Room number: ");
                // roomNo = keyboard.nextInt();

                validInput = true;
                // create customer
                
                
            } 
            catch(InputMismatchException e) 
            {
                JOptionPane.showMessageDialog(null, "Enter number for Contact ID eg. 4555, word for Hostel eg. Walter, number for room number eg. 12");
                
                
            }
        } while (!validInput); 
                Customer customer1 = new Customer(userID, name,contactID, hostel, roomNo);
                return customer1;
        
    }
    public static void makeOrder(Customer user, Cafeteria cafeteria){
        boolean validInput = false;
        do 
        {
            try
            {
                Scanner keyboard = new Scanner(System.in);
                cafeteria.displayMealsMenu();
                JOptionPane.showMessageDialog(null, "\nWhat would you like to eat? Please type in number: ");
                int orderno = keyboard.nextInt();
                validInput = true;
        
                // Create an order
                Order order = new Order(user, cafeteria,cafeteria.getMealsMenu().get(orderno-1));
                order.displayOrderDetails();
                
                Scanner input = new Scanner(System.in);
                initiateGame(input);
            } 
    
            catch (InputMismatchException e) 
            {
                JOptionPane.showMessageDialog(null, "Please enter a number to select the meal.");
            }

        }
        while (!validInput);
        

        
    }
    /*public static void learnClimateChange(){

    }*/
 
    /**
     * This method will accept the questions and responses for a particular country, and asks the user questions based on the article
     * It will then return the totalPoints accumulated from the game
     * @param questions
     * @param answers
     * @return
     */
    public static int playGame(String[] questions, char[] answers, Scanner input)
    {
        int totalPoints = 0;
            for (int i=0; i<questions.length;i++)
            {
                JOptionPane.showMessageDialog(null, questions[i]);
                JOptionPane.showMessageDialog(null, "Please respond with a A or B: ");
                String userResponse = input.next().toUpperCase();
                //validate the user's input
                if (!userResponse.equals("A") && !userResponse.equals("B"))
                {
                    JOptionPane.showMessageDialog(null, "Invalid response. Please enter either an A or B");
                    i--;
                    continue;
                }
                
                char answer = userResponse.charAt(0);

                if (answer == answers[i])
                {
                    totalPoints +=100;
                } else {JOptionPane.showMessageDialog(null, "The right answer is " + answers[i]);}
                // JOptionPane.showMessageDialog(null, );
            
        } return totalPoints;
        
    }

    /**
     * This method initiates the entire game allowing the user an option to play the game or not
     * @param input
     */
    public static void initiateGame(Scanner input)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Climate change quiz game. Here we test your understanding of the climate by giving you an short article to read after which you answer some few questions based on it.");
        JOptionPane.showMessageDialog(null, "Do you want to play this game (Enter y(yes) or n(no)): ");
        String userInput = input.nextLine();
        char userResponse = userInput.toLowerCase().charAt(0);
    
        //If user enters y
        if (userResponse == 'y')
        {
            String countryChoice = getCountry(input);
            //Display the article based on the user choice

            while (checkValidInputCountry(countryChoice) == false) 
            {
                countryChoice = getCountry(input);
            }
            JOptionPane.showMessageDialog(null, "....We would like to test your knowledge on the article you just read");
            JOptionPane.showMessageDialog(null, "Please press enter to begin the quiz");
    
            //wait to user to hit enter before beginning the quiz
            input.nextLine();
            displayQuestions(countryChoice, input);
        }

        else if (userResponse == 'n')
        {
            JOptionPane.showMessageDialog(null, "..................");
            displayActionPlan();
        }
        
    }

    /**
     * This method gets the choice of country the user would want to learn about
     * @param input
     * @return
     */
    public static String getCountry(Scanner input)
    {
        JOptionPane.showMessageDialog(null, "We have three articles\nEnter Ghana to increase your knowledge on climate change in Ghana\nEnter Nigeria to increase your knowledge on climate change in Nigeria\nEnter General Knowledge to increase your knowledge on the nature of climate in the world.\n");
        String countryChoice = input.nextLine();
        return countryChoice;
    }
    
    /**
     * This method validates the country provided by the user
     * @param country
     * @return
     */
    public static boolean checkValidInputCountry(String country)
    {
        if (country.equalsIgnoreCase("Ghana") || country.equalsIgnoreCase("Nigeria") || country.equalsIgnoreCase("General Knowledge"))
        {
            Article.displayArticle(country);
            return true;
        } else {JOptionPane.showMessageDialog(null, "Invalid Choice. Please enter Ghana, Nigeria, or General Knowledge");
    return false;}
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


  /*public static void takeQuiz(){

    }*/
}