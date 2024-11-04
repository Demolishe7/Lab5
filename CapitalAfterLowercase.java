import java.util.regex.*;

public class CapitalAfterLowercase {
    public static void main(String[] args) {
        String text = "thatisanAppealingtreasureMapthatIcan'tRead";
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("$1!$2");
        System.out.println(result);
    }
}