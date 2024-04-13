public class Customer {
    private int userId; // User ID attribute
    private String name; // Customer's name attribute
    private int points; // Points attribute
    private int contactId; // Contact ID attribute
    private String hostel; // Optional hostel attribute
    private int roomId; // Room ID attribute

    // Constructor to initialize the Customer object
    public Customer(int userId, String name, int contactId, String hostel, int roomId) {
        this.userId = userId;
        this.name = name;
        this.points = 0; // Starting points set to 0
        this.contactId = contactId;
        this.hostel = hostel;
        this.roomId = roomId;
    }

    // Method to accumulate points based on quiz outcome
    public void accumulatePointsFromQuiz(boolean quizResult) {
        if (quizResult) {
            // Earn 10 points on scoring full results
            int pointsEarned = 10;  
            // Add the points earned to the user's total points
            points += pointsEarned;
            // Print a message indicating the points accumulated from the quiz
            System.out.println("All questions answered correctly. " + pointsEarned + " points earned. Total points: " + points);
            
        
        } else {
            // Print a message indicating no points earned due to incorrect answer
            System.out.println("Oh Damn!! Had some questions answered incorrectly. No points earned.\nBetter luck next time!");
        }
    }

    // Method to view the receipt of a specific order
    public void viewReceipt(int orderId) {
        // Logic to view the receipt of an order
        System.out.println("Viewing receipt for order " + orderId);
    }

    // Method to edit an order based on an order ID
    public void editOrder(int orderId) {
        // Logic to edit an order
        System.out.println("Editing order " + orderId);
    }

    // Method for the customer to place an order for food
    public void orderFood() {
        // Logic to order food
        System.out.println(name + " is ordering food...");
    }

    // Method to send a notification to the user
    public void getNotificationUser(String notification) {
        // Logic to notify the user
        System.out.println("Notification for " + name + ": " + notification);
    }

    // Method for the user to read an article
    public void readArticle() {
        // Logic to read an article
        System.out.println(name + " is reading an article...");
    }

    // Method for the user to take a quiz
    public void takeQuiz() {
        // Logic to take a quiz
        System.out.println(name + " is taking a quiz...");
    }

    // Method to retrieve the user's current points
    public int getPoint() {
        System.out.println(name + " has " + points + " points.");
        return points;
    }

    // Getters and setters for the attributes

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
    // Main method for testing the Customer class
    public static void main(String[] args) {
        // Create a new Customer object
        Customer customer = new Customer(12345, "John Doe", 67890, "Sunrise Hostel", 305);

        // Test the methods
        customer.orderFood();
        customer.accumulateOrder(101);
        customer.viewReceipt(101);
        customer.editOrder(101);
        customer.getNotificationUser("Order is ready.");
        customer.readArticle();
        customer.takeQuiz();
        customer.getPoints();
    }
}
