import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {
        if (list1==null && list2==null) {
            return true;
        }
        if (list1==null || list2==null) {
            return false;
        }
        if (list1.equals(list2)) {
            return true;
        }
        return false;
    }
}