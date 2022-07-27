import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String CLASS_REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String text1 = "C5318G";
        String text2 = "C09340G";
        String text3 = "A0323A";

        Pattern pat = Pattern.compile("^[ACP]\\d{4}[GHIKLM]$");
        Matcher mat = pat.matcher(text1);
        Matcher mat1 = pat.matcher(text2);
        Matcher mat2 = pat.matcher(text3);

       Boolean match = mat.matches();
       Boolean match1 = mat1.matches();
       Boolean match2 = mat2.matches();


        System.out.println(match);
        System.out.println(match1);
        System.out.println(match2);

        ValidateClassName classes = new ValidateClassName();
        System.out.println(classes.validate(text1));
    }
}
