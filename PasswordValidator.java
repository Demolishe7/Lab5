import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Passw0rd";
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }
}