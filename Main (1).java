import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      initiateGame(input);
    }
 
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
                System.out.println(questions[i]);
                System.out.print("Please respond with a A or B: ");
                String userResponse = input.next().toUpperCase();
                //validate the user's input
                if (!userResponse.equals("A") && !userResponse.equals("B"))
                {
                    System.out.println("Invalid response. Please enter either an A or B");
                    i--;
                    continue;
                }
                
                char answer = userResponse.charAt(0);

                if (answer == answers[i])
                {
                    totalPoints +=100;
                } else {System.out.println("The right answer is " + answers[i]);}
                System.out.println();
            
        } return totalPoints;
        
    }

   
    /**
     * This method initiates the entire game allowing the user an option to play the game or not
     * @param input
     */
    /*public static void initiateGame(Scanner input)
    {
        System.out.println("Welcome to the Climate change quiz game. Here we test your understanding of the climate by giving you an short article to read after which you answer some few questions based on it.");
        System.out.print("Do you want to play this game (Enter y(yes) or n(no)): ");
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
            System.out.println("....We would like to test your knowledge on the article you just read");
            System.out.println("Please press enter to begin the quiz");
    
            //wait to user to hit enter before beginning the quiz
            input.nextLine();
            displayQuestions(countryChoice, input);
        }

        else if (userResponse == 'n')
        {
            System.out.println("..................");
            displayActionPlan();
        }
        
    }*/

    /**
     * This method gets the choice of country the user would want to learn about
     * @param input
     * @return
     */
    /*public static String getCountry(Scanner input)
    {
        System.out.print("We have three articles\nEnter Ghana to increase your knowledge on climate change in Ghana\nEnter Nigeria to increase your knowledge on climate change in Nigeria\nEnter General Knowledge to increase your knowledge on the nature of climate in the world.\n");
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
        } else {System.out.println("Invalid Choice. Please enter Ghana, Nigeria, or General Knowledge");
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
            System.out.println();
            QuestionsGhana ghanaQuestions = new QuestionsGhana();
            int result = playGame(ghanaQuestions.getQuestions(), ghanaQuestions.getAnswers(), input);
            displayPointsAccumulated(result);

        }

        else if (countryChoice.equalsIgnoreCase("Nigeria"))
        {
            System.out.println();
            QuestionsNigeria nigeriaQuestions = new QuestionsNigeria();
            int result = playGame(nigeriaQuestions.getQuestions(), nigeriaQuestions.getAnswers(), input);
            displayPointsAccumulated(result);
        }

        else if (countryChoice.equalsIgnoreCase("General Knowledge"))
        {
            System.out.println();
            GeneralKnowledge generalKnowledge = new GeneralKnowledge();
            int result = playGame(generalKnowledge.getQuestions(), generalKnowledge.getAnswers(), input);
            displayPointsAccumulated(result);
        }
        displayActionPlan();

    }

    /**
     * This method displays the total points accumulated from the quiz
     * @param result
     */
    public static void displayPointsAccumulated(int result)
    {
        System.out.println("....................You scored " + result +" / 500 points...................." + "\n");
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
                    System.out.println(data);
               }
               myScanner.close();
            } catch (FileNotFoundException e)
            {
                System.out.println("An error occured");
                e.printStackTrace();
            }

    }


}
*/