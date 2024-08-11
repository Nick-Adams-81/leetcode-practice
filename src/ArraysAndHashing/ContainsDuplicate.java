package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean duplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
