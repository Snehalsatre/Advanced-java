class MinorAlert extends RuntimeException {
    public MinorAlert(int age) {
        super("Access Denied: Age " + age + " is below the limit.");
    }
}

class ClubEntry {
    public void checkIdentity(int age) {
        if (age < 21) {
            throw new MinorAlert(age);
        }
        System.out.println("Welcome to the club!");
    }
}