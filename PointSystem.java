import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The PointSystem class represents a system for calculating, tracking, and managing points earned by users.
 */
public class PointSystem {
    private double thresholdPercentage; // Threshold percentage for point calculations
    private double equivalentAmount; // Equivalent amount for points accumulation
    private double totalPointTrackAccumulation; // Total points accumulated

    /**
     * Constructs a new PointSystem object with the specified threshold percentage and equivalent amount.
     *
     * @param thresholdPercentage the percentage threshold for point calculations
     * @param equivalentAmount the equivalent amount for points accumulation
     */
    public PointSystem(double thresholdPercentage, double equivalentAmount) {
        this.thresholdPercentage = thresholdPercentage;
        this.equivalentAmount = equivalentAmount;
        this.totalPointTrackAccumulation = 0.0; // Initialize with zero points
    }

    /**
     * Retrieves the user's name.
     *
     * @return a hardcoded username for demonstration purposes
     */
    public String getUserName() {
        // In a real-world scenario, this would return the actual user's name
        return "user123";
    }

    /**
     * Determines whether the user's answer is correct.
     *
     * @return true to indicate the answer was correct (hardcoded for demonstration purposes)
     */
    public boolean getCorrectAnswer() {
        // In a real-world scenario, this would depend on user input or quiz results
        return true;
    }

    /**
     * Calculates and accumulates points based on whether the user answered correctly.
     */
    public void calculatePoints() {
        if (getCorrectAnswer()) {
            // Calculate points based on the threshold percentage
            double pointsEarned = equivalentAmount * thresholdPercentage;
            totalPointTrackAccumulation += pointsEarned;
            System.out.println("Points earned: " + pointsEarned);
        } else {
            System.out.println("No points earned as the answer was incorrect.");
        }
        System.out.println("Total points accumulated: " + totalPointTrackAccumulation);
    }


    // /**
    //  * Accumulates points based on whether the user answers a quiz question correctly.
    //  * 
    //  * @param quizResult a boolean indicating whether the user answered the quiz question correctly (true if correct, false otherwise)
    //  */
    // public void accumulatePointsFromQuiz(boolean quizResult) {
    //     if (quizResult) {
    //         // Define the number of points earned for a correct quiz answer
    //         int pointsEarned = 10;
            
    //         // Add the points earned to the user's total points
    //         points += pointsEarned;
            
    //         // Print a message indicating the points accumulated from the quiz
    //         System.out.println("Quiz answered correctly. " + pointsEarned + " points earned. Total points: " + points);
    //     } else {
    //         // Print a message indicating no points earned due to incorrect answer
    //         System.out.println("Quiz answered incorrectly. No points earned.");
    //     }
    // }


    /**
     * Writes the user's points data to a file.
     *
     * @param username the username for whom the points data will be written
     */
    public void writePointsToFile(String username) {
        String fileName = username + "_points.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Username: " + username + "\n");
            writer.write("Total Points Accumulated: " + totalPointTrackAccumulation + "\n");
            System.out.println("Points data written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing points data to file: " + e.getMessage());
        }
    }

    /**
     * Resets the points accumulated for a specified user.
     *
     * @param username the username for whom the points will be reset
     */
    public void resetPoints(String username) {
        totalPointTrackAccumulation = 0.0;
        System.out.println("Points reset for user: " + username);
    }

    /**
     * Retrieves the threshold percentage used for point calculations.
     *
     * @return the threshold percentage
     */
    public double getThresholdPercentage() {
        return thresholdPercentage;
    }

    /**
     * Sets the threshold percentage used for point calculations.
     *
     * @param thresholdPercentage the threshold percentage to set
     */
    public void setThresholdPercentage(double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * Retrieves the equivalent amount for points accumulation.
     *
     * @return the equivalent amount
     */
    public double getEquivalentAmount() {
        return equivalentAmount;
    }

    /**
     * Sets the equivalent amount for points accumulation.
     *
     * @param equivalentAmount the equivalent amount to set
     */
    public void setEquivalentAmount(double equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    /**
     * Retrieves the total points accumulated.
     *
     * @return the total points accumulated
     */
    public double getTotalPointTrackAccumulation() {
        return totalPointTrackAccumulation;
    }

    /**
     * Sets the total points accumulated.
     *
     * @param totalPointTrackAccumulation the total points accumulated to set
     */
    public void setTotalPointTrackAccumulation(double totalPointTrackAccumulation) {
        this.totalPointTrackAccumulation = totalPointTrackAccumulation;
    }

    /**
     * Main method for testing the PointSystem class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize a PointSystem object
        PointSystem pointSystem = new PointSystem(0.1, 100.0);

        // Simulate earning points
        pointSystem.calculatePoints();

        // Write points data to a file
        String username = pointSystem.getUserName();
        pointSystem.writePointsToFile(username);

        // Reset points for the user
        pointSystem.resetPoints(username);
    }
}
