package ExceptionHandling;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class Login {
    private final String storedUsername = "admin";
    private final String storedPassword = "password123";

    public void login(String username, String password) throws InvalidCredentialsException {
        System.out.println("Attempting login for user: " + username);
        System.out.println("-----------------------------------");

        if (!storedUsername.equals(username) || !storedPassword.equals(password)) {
            throw new InvalidCredentialsException("Invalid Username or Password");
        }

        System.out.println("Login Successful");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Login auth = new Login();

        String inputUser = "admin";
        String inputPass = "wrongPassword";

        try {
            auth.login(inputUser, inputPass);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
