import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int maximumWealth(int[][] accounts) {
        AtomicInteger max = new AtomicInteger(0);

        Arrays.stream(accounts).forEach(rows -> {
            int sum = Arrays.stream(rows).sum();
            max.set(Math.max(sum, max.get()));
        });

        return max.get();
    }
}
