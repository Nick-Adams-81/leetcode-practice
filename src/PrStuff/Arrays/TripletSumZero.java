package PrStuff.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

    public List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left+1] ) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets;
    }
}
