class FixedDepositAccount extends Account {
    protected double interestRate, interest;

    public FixedDepositAccount(String accountNo, String name) {
        super(accountNo, name);
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) {
            System.out.println("Invalid Interest Rate");
            return;
        }
        else {
            this.interestRate += interestRate;
        }  
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public void calculateInterest() {
        this.interest = balance * interestRate / 100.0;
    }
}
