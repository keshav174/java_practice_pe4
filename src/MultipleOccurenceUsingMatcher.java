import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceUsingMatcher {
    public String multipleOccurenceUsingMatcher (String input, String pattern) {
        Pattern patternCheck = Pattern.compile(pattern);
        Matcher matcher = patternCheck.matcher(input);
        String str ="";
        int count = 0;
        while (matcher.find()) {

            count++;
            //System.out.println("Found at:" + matcher.start() + "-" + matcher.end());
            str=str+("Found at:" + matcher.start() + "-" + matcher.end());
        }

        System.out.println(str);
        return str;

    }
}
