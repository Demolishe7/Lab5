import java.util.regex.*;

public class WordFinder {
    public static void main(String[] args) {
        String text = "That is an appealing treasure map that I can't read.";
        char letter = 't';
        Pattern pattern = Pattern.compile("\\b" + letter + "\\w*\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}