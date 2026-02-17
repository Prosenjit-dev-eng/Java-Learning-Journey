/*5. Each customer of a bank has customer id, name, and current loan amount and phone number. One can change the attributes like name, phone number. A customer may ask for loan of certain amount. It is granted provided the sum of current loan amount and asked amount does not exceed credit limit (fixed amount for all customer). A customer can be a privileged customer. For such customers credit limit is higher. Once a loan is sanctioned necessary updates should be made. Any type of customer should be able to find his credit limit, current loan amount and amount of loan (s)he can seek.  No customer can change customer id once created. Print customer name when the object is printed by toString() method. Design and implement the classes. Show the working through a menu driven user interface */
import java.util.Scanner;

// Base Customer Class
class Customer {

    private final int customerId;   // Cannot be changed
    private String name;
    private String phoneNumber;
    protected double currentLoanAmount;

    protected static final double CREDIT_LIMIT = 50000;  // Normal limit

    public Customer(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.currentLoanAmount = 0;
    }

    // Change name
    public void setName(String name) {
        this.name = name;
    }

    // Change phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCreditLimit() {
        return CREDIT_LIMIT;
    }

    public double getCurrentLoanAmount() {
        return currentLoanAmount;
    }

    public double getEligibleLoanAmount() {
        return getCreditLimit() - currentLoanAmount;
    }

    public void requestLoan(double amount) {
        if (currentLoanAmount + amount <= getCreditLimit()) {
            currentLoanAmount += amount;
            System.out.println("Loan sanctioned successfully!");
        } else {
            System.out.println("Loan denied! Exceeds credit limit.");
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return name;  // Print name when object is printed
    }
}


// Privileged Customer Class
class PrivilegedCustomer extends Customer {

    private static final double PRIVILEGED_LIMIT = 100000;

    public PrivilegedCustomer(int customerId, String name, String phoneNumber) {
        super(customerId, name, phoneNumber);
    }

    @Override
    public double getCreditLimit() {
        return PRIVILEGED_LIMIT;
    }
}


// Main Class with Menu
public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Is Privileged Customer? (yes/no): ");
        String type = sc.nextLine();

        Customer customer;

        if (type.equalsIgnoreCase("yes")) {
            customer = new PrivilegedCustomer(id, name, phone);
        } else {
            customer = new Customer(id, name, phone);
        }

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Change Name");
            System.out.println("2. Change Phone");
            System.out.println("3. Request Loan");
            System.out.println("4. View Credit Limit");
            System.out.println("5. View Current Loan");
            System.out.println("6. View Eligible Loan Amount");
            System.out.println("7. Print Customer");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter new name: ");
                    customer.setName(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter new phone: ");
                    customer.setPhoneNumber(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter loan amount: ");
                    double amount = sc.nextDouble();
                    customer.requestLoan(amount);
                    break;

                case 4:
                    System.out.println("Credit Limit: " + customer.getCreditLimit());
                    break;

                case 5:
                    System.out.println("Current Loan: " + customer.getCurrentLoanAmount());
                    break;

                case 6:
                    System.out.println("Eligible Loan Amount: " + customer.getEligibleLoanAmount());
                    break;

                case 7:
                    System.out.println("Customer Name: " + customer);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}

