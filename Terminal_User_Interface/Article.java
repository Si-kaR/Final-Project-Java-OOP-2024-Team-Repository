import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Article 
{
    /**
     * 
     * @param choice
     */
    public static void displayArticle(String choice)
    {
        switch (choice.toLowerCase()) {
            case "ghana":
                // Read from "article1.txt" file
                try {
                    File myFile1 = new File("article1.txt");
                    Scanner myScanner = new Scanner(myFile1);
                    while (myScanner.hasNextLine()) {
                        String data = myScanner.nextLine();
                        System.out.println(data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred while reading article1.txt");
                    e.printStackTrace();
                }
                break;
        
            case "nigeria":
                // Read from "article2.txt" file
                try {
                    File myFile2 = new File("article2.txt");
                    Scanner myScanner = new Scanner(myFile2);
                    while (myScanner.hasNextLine()) {
                        String data = myScanner.nextLine();
                        System.out.println(data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred while reading article2.txt");
                    e.printStackTrace();
                }
                break;
        
            case "general knowledge":
                // Read from "GeneralKnowledge.txt" file
                try {
                    File myFile3 = new File("GeneralKnowledge.txt");
                    Scanner myScanner = new Scanner(myFile3);
                    while (myScanner.hasNextLine()) {
                        String data = myScanner.nextLine();
                        System.out.println(data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred while reading GeneralKnowledge.txt");
                    e.printStackTrace();
                }
                break;
        
            default:
                System.out.println("Invalid choice. Please choose 'Ghana', 'Nigeria', or 'General Knowledge'.");
                break;
        }
        
        

     
    }
}
