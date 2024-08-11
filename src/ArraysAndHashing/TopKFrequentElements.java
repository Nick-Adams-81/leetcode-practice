package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = Objects.requireNonNull(pq.poll()).getKey();
        }
        return result;
    }
}
