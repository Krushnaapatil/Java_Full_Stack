package ExceptionHandling;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class VoterIDException {
    static void checkEligibility(int age) throws AgeRestrictionException {
        if (age < 21) {
            throw new AgeRestrictionException("Access Denied: Age must be 21 or above to register for Voter ID.");
        }
        System.out.println("Access Granted: Eligible for Voter ID!");
    }

    public static void main(String[] args) {
        int voterAge = 18;

        try {
            checkEligibility(voterAge);
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
