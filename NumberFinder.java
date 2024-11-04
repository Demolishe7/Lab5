import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "It had been 60 days since the zombies 1-st attacked.";
        Pattern pattern = Pattern.compile("\\b\\d+\\.?\\d*\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}