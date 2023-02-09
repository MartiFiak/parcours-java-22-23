import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> l = new ArrayList<>(list);
        Collections.sort(result);
        return result;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> l = new ArrayList<>(list);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}