abstract class Account {
    protected String accountNo, name;
    double balance;

    Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        else {
            this.balance += amount;
        }
    }

    public void display() {
        System.out.println("Account No: " + this.accountNo);
        System.out.println("Account Holder Name: " + this.name);
        System.out.printf("Account Balance= %.2f" , this.balance);
    }

    abstract public void calculateInterest();
}
