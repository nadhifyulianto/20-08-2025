
    public class AccountTest {
    public static void main(String[] args) {
       SavingAccount sa0001 = new SavingAccount();
        sa0001.balance = 1000;
        sa0001.balance += sa0001.calculateInterest();
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        sa0001.displayCustomer();
        SavingAccount sa0002 = new SavingAccount();
        sa0002.balance = 2000;
        sa0002.balance += sa0002.calculateInterest();
        sa0002.name = "Bill";
        sa0002.interestRate = 0.03;
        sa0002.displayCustomer();
}}