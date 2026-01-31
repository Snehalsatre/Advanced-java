class DebtException extends Exception {
    public DebtException(double current, double request) {
        super("Transaction Denied. Current Cash: " + current + " | Missing: " + (request - current));
    }
}

class CashVault {
    private double stash = 100.0;

    public void spend(double cost) throws DebtException {
        if (cost > stash) {
            throw new DebtException(stash, cost);
        }
        stash -= cost;
        System.out.println("Success! Remaining stash: " + stash);
    }
}