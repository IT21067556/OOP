public class Main {
    public static void main(String args[]) {
        FixedDepositAccount fixed = new FixedDepositAccount("A001", "Sahan");
        SavingsAccount savings = new SavingsAccount("A002", "Pawan");

        fixed.deposit(13000.50);

        savings.deposit(5500);
        savings.withdraw(2000);
    }
}

