public class BuggyCode {

    private String name;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;
    private String occupation;
    private String testing;
 
    public BuggyCode(String name, int age, String address, String email, String phoneNumber, String occupation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.testing = "";
    }
 
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Occupation: " + occupation);
    }
 
    public void printPersonalInfo() {
        printDetails(); 
    }
 
    public void updateContactInfo(String newAddress, String newEmail, String newPhone) {
        address = newAddress;
        email = newEmail;
        phoneNumber = newPhone;
    }
 
    public void updateDetails(String newName, int newAge, String newAddress, String newEmail, String newPhone) {
        name = newName;
        age = newAge;
        address = newAddress;
        email = newEmail;
        phoneNumber = newPhone;
    }
 
    public void sendEmailNotification(String message) {
        if (email == null || email.isEmpty()) {
            System.out.println("No email provided!");
            return; // Complex control flow
        }
        System.out.println("Sending email to " + email + ": " + message);
    }
 
    public void sendTextNotification(String message) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            System.out.println("No phone number provided!");
            return; // Complex control flow
        }
        System.out.println("Sending text to " + phoneNumber + ": " + message);
    }
 
    public void processUserData(String data) {
        String[] userDetails = data.split(","); // Assume data is comma-separated
        if (userDetails.length < 6) {
            System.out.println("Insufficient data!");
            return;
        }
        name = userDetails[0];
        age = Integer.parseInt(userDetails[1]);
        address = userDetails[2];
        email = userDetails[3];
        phoneNumber = userDetails[4];
        occupation = userDetails[5];
 
        // Duplicated logic for sending notifications
        sendEmailNotification("Welcome " + name);
        sendTextNotification("Welcome " + name);
    }
 
    public void printGreeting() {
        System.out.println("Hello, " + name + "!"); // Long method with multiple responsibilities
        if (age < 18) {
            System.out.println("You're a minor.");
        } else {
            System.out.println("You're an adult.");
        }
    }
 
    public void displayFullInfo() {
        printDetails(); // Duplicated code
        printGreeting(); // Coupled methods
    }
 
    public static void main(String[] args) {
        BuggyCode user1 = new BuggyCode("Alice", 30, "123 Main St", "alice@example.com", "555-1234", "Engineer");
        user1.printDetails();
        user1.updateContactInfo("456 Elm St", "alice@newdomain.com", "555-5678");
        user1.sendEmailNotification("Welcome to our service!");
        user1.processUserData("Bob,25,789 Pine St,bob@example.com,555-8765,Designer");
        user1.displayFullInfo();
    }
 }
 