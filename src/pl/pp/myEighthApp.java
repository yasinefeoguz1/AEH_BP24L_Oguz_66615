import java.util.Scanner;

public class myEighthApp {

    public static void main(String[] args) {
        // Create Account instance
        Account account = new Account("123456789", 1000.0, "John Doe", "john.doe@example.com", "123-456-789");

        // Print initial account info
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: PLN " + account.getBalance());

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Deposit operation
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw operation
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        scanner.close();
    }

    // Account class
    public static class Account {
        private String accountNumber;
        private double balance;
        private String ownerName;
        private String email;
        private String phoneNumber;

        // Constructor
        public Account(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.ownerName = ownerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters
        public String getAccountNumber() { return accountNumber; }
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }
        public String getOwnerName() { return ownerName; }
        public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPhoneNumber() { return phoneNumber; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

        // Deposit method
        public void deposit(double amount) {
            this.balance += amount;
            System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + this.balance);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrew PLN " + amount + " from the account, Remaining balance = PLN " + this.balance);
            } else {
                System.out.println("Insufficient funds. You have PLN " + this.balance + " in your account.");
            }
        }
    }
}
