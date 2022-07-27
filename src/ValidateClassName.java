import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        String text1 = "C5318G";
        String text2 = "C09340G";
        String text3 = "A0323A";

        Pattern pat = Pattern.compile("^[ACP]\\d{4}[GHIKLM]$");
        Matcher matcher = pat.matcher(text1);
        Matcher matcher1 = pat.matcher(text2);
        Matcher matcher2 = pat.matcher(text3);

       Boolean match = matcher.matches();
       Boolean match1 = matcher1.matches();
       Boolean match2 = matcher2.matches();

        System.out.println(match);
        System.out.println(match1);
        System.out.println(match2);
    }
}
