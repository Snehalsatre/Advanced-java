class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double balance, double amount) {
        super("Transaction Failed! Balance: $" + balance + 
              " | Deficit: $" + (amount - balance));
    }
}

class BankAccountt {
    private double balance = 1000.00;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining: $" + balance);
    }
}