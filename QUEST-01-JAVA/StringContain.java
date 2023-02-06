import javax.security.auth.Subject;

public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString == null || s == null) {
            return false;
        }
        if (subString.length() > s.length()) {
            return false;
        }
        boolean string = s.indexOf(subString) != -1? true : false;
        return string;
    }
}