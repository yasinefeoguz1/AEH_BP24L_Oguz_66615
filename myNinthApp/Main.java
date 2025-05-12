public class Main {
    public static void main(String[] args) {
        // Create a new account
        Account myAccount = new Account(
                "12345678",         // Account number
                1000.0,             // Initial balance
                "John Doe",         // Account owner
                "john@example.com", // Email
                "555-1234"          // Phone number
        );

        // Try some operations
        myAccount.withdraw(900.0);     // Withdraw 900
        myAccount.deposit(250.0);      // Deposit 250
        myAccount.withdraw(50.0);      // Withdraw 50
        myAccount.withdraw(500.0);     // This should fail (insufficient balance)
    }
}
