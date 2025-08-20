public class SavingAccount {
   public double balance;
    public double interestRate;
    public String name;

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest Earned: " + (balance * interestRate));
    }
    // Method to calculate monthly interest
    public double calculateInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }
}// end class SavingsAccount


        
    


