package PrStuff.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SumSwap {

    public int[] sumSwap(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }

        int target = (sum2 - sum1) / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num - target)){
                return new int[] {num - target, num};
            }
        }
        return new int[0];
    }

}
