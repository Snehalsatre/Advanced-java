class BankAccount {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
    }
}

class VoterRegistration {
    public void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Registration Failed: Age " + age + " is under 18.");
        }
        System.out.println("Registration Successful! You are now a registered voter.");
    }
}