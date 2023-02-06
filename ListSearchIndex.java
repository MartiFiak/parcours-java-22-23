import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (value == null || list == null) {
            return null;
        }
        if (list.indexOf(value) < 0) {
            return null;
        }
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (value == null || list == null) {
            return null;
        }
        if (list.indexOf(value) < 0) {
            return null;
        }
        return list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (value == null || list == null) {
            return new ArrayList<Integer>();
        }
        
        List<Integer> newlist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                newlist.add(i);
            }
        }
        return newlist;
    }
}