public class StringConcat {
    public static String concat(String s1, String s2) {
        if (s1 == null) {
            return s2;
        }
        if (s2 == null) {
            return s1;
        }
         String concat = s1 + s2;
         return concat;
    }
}