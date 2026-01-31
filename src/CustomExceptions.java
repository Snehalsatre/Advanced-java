// Checked Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double balance, double amount) {
        super("Insufficient Funds! Balance: " + balance + " | Deficit: " + (amount - balance));
    }
}

// Unchecked Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}