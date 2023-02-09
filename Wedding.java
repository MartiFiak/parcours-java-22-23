import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        if (first == null || second == null) {
            return null;
        }
        List<String> lfirst = new ArrayList<>(first);
        List<String> lsecond = new ArrayList<>(second);
        Map<String, String> map = new HashMap<>();
        if(lfirst.size() <= lsecond.size()) {
            for (int i = 0; i < lfirst.size(); i++) {
                map.put(lfirst.get(i), lsecond.get(i));
            }
        }
        if(lfirst.size() > lsecond.size()) {
            for (int i = 0; i < lsecond.size(); i++) {
                map.put(lfirst.get(i), lsecond.get(i%lsecond.size()));
            }
        }
        return map;

    }
    
}