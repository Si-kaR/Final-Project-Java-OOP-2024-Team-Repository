/**
 * The Customer class represents a customer in a hostel.
 */
public class Customer {
    private int userId; // User ID attribute
    private String name; // Customer's name attribute
    private int points; // Points attribute
    private int contactId; // Contact ID attribute
    private String hostel; // Optional hostel attribute
    private int roomId; // Room ID attribute

    /**
     * Constructs a new Customer object with the specified attributes.
     *
     * @param userId    the unique identifier of the customer
     * @param name      the name of the customer
     * @param contactId the contact ID of the customer
     * @param hostel    the hostel where the customer is staying
     * @param roomId    the room ID of the customer
     */
    public Customer(int userId, String name, int contactId, String hostel, int roomId) {
        this.userId = userId;
        this.name = name;
        this.points = 0; // Starting points set to 0
        this.contactId = contactId;
        this.hostel = hostel;
        this.roomId = roomId;
    }

    /**
     * Accumulates points for the customer based on an order ID.
     *
     * @param orderId the ID of the order
     */
    public void accumulateOrder(int orderId) {
        // Logic to accumulate points from an order
        // For demonstration, let's assume each order gives 10 points
        points += 10;
        System.out.println("Order " + orderId + " accumulated. Points: " + points);
    }
    public String getName(){
        return name;
    }
    public int getUserId(){
        return userId;
    }

    public String getHostel(){
        return hostel;
    }

    public int getRoomId(){
        return roomId;
    }

    public void setHostel(String hostelID){
        this.hostel = hostelID;
    }

    public void setRoomID(int roomNo){
        this.roomId = roomNo;
    }
    /**
     * Displays the receipt of a specific order.
     *
     * @param orderId the ID of the order
     */
    public void viewReceipt(int orderId) {
        // Logic to view the receipt of an order
        System.out.println("Viewing receipt for order " + orderId);
    }

    /**
     * Allows the customer to edit an order based on an order ID.
     *
     * @param orderId the ID of the order
     */
    public void editOrder(int orderId) {
        // Logic to edit an order
        System.out.println("Editing order " + orderId);
    }

    /**
     * Allows the customer to place an order for food.
     */
    public void orderFood() {
        // Logic to order food
        System.out.println(name + " is ordering food...");
    }

    /**
     * Sends a notification to the user.
     *
     * @param notification the notification message
     */
    public void getNotificationUser(String notification) {
        // Logic to notify the user
        System.out.println("Notification for " + name + ": " + notification);
    }

    /**
     * Allows the user to read an article.
     */
    public void readArticle() {
        // Logic to read an article
        System.out.println(name + " is reading an article...");
    }

    /**
     * Allows the user to take a quiz.
     */
    public void takeQuiz() {
        // Logic to take a quiz
        System.out.println(name + " is taking a quiz...");
    }

    /**
     * Retrieves the user's current points.
     *
     * @return the number of points accumulated by the user
     */
    public int getPoints() {
        System.out.println(name + " has " + points + " points.");
        return points;
    }

    /**
     * Main method for testing the Customer class.
     *
     * @param args the command-line arguments
     */
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
