import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Article {
    
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
                        JOptionPane.showMessageDialog(null, data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while reading article1.txt");
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
                        JOptionPane.showMessageDialog(null, data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while reading article2.txt");
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
                        JOptionPane.showMessageDialog(null, data);
                    }
                    myScanner.close();
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred while reading GeneralKnowledge.txt");
                    e.printStackTrace();
                }
                break;
        
            default:
                JOptionPane.showInputDialog(null, "Invalid choice. Please choose 'Ghana', 'Nigeria', or 'General Knowledge'.");
                break;
        }
        
        

     
    }
}
