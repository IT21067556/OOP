public class SavingsAccount extends FixedDepositAccount {
    public SavingsAccount(String accountNo, String name) {
        super(accountNo, name);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        else if (amount > balance) {
            System.out.println("Amount cannot be greater than current Balance");
            return;
        }
        else {
            this.balance -= amount;
        }
        
    }

    @Override
    public void calculateInterest() {
        this.interest = balance * interestRate / 100.0 / 12.0;
    }
}
