import java.util.Collections;
import java.util.List;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
    

    public static List<Integer> sortReverse(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
    
}