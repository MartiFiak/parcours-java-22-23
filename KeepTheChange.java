import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        if (coins == null || coins.isEmpty()) {
            return Collections.emptyList();
        }
        List<Integer> sortedCoins = new ArrayList<>(coins);
        Collections.sort(sortedCoins, Collections.reverseOrder());

        List<Integer> change = new ArrayList<>();
        for (Integer coin : sortedCoins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }
        return change;
    }
}