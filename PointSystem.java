import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PointSystem {
    private double thresholdPercentage; // Threshold percentage for point calculations
    private double equivalentAmount; // Equivalent amount for points accumulation
    private double totalPointTrackAccumulation; // Total points accumulated

    // Constructor to initialize the PointSystem object
    public PointSystem(double thresholdPercentage, double equivalentAmount) {
        this.thresholdPercentage = thresholdPercentage;
        this.equivalentAmount = equivalentAmount;
        this.totalPointTrackAccumulation = 0.0; // Initialize with zero points
    }

    // Method to get the user's name (this could be retrieved from a user system)
    public String getUserName() {
        // For demonstration purposes, let's return a hardcoded username
        // In a real-world scenario, this would be dynamic
        return "user123";
    }

    // Method to get whether the user answered correctly (returning a boolean)
    public boolean getCorrectAnswer() {
        // For demonstration, let's return true to indicate the answer was correct
        // In a real-world scenario, this would depend on user input or quiz results
        return true;
    }

    // Method to calculate points based on whether the user answered correctly
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

    // Method to write points data to a file for a specific user
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

    // Method to reset points for the specified user
    public void resetPoints(String username) {
        totalPointTrackAccumulation = 0.0;
        System.out.println("Points reset for user: " + username);
    }

    // Getters and setters for the attributes

    public double getThresholdPercentage() {
        return thresholdPercentage;
    }

    public void setThresholdPercentage(double thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    public double getEquivalentAmount() {
        return equivalentAmount;
    }

    public void setEquivalentAmount(double equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    public double getTotalPointTrackAccumulation() {
        return totalPointTrackAccumulation;
    }

    public void setTotalPointTrackAccumulation(double totalPointTrackAccumulation) {
        this.totalPointTrackAccumulation = totalPointTrackAccumulation;
    }

    // Main method for testing the PointSystem class
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
