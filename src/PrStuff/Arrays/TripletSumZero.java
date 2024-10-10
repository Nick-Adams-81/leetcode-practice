package PrStuff.Arrays;

import java.util.*;

public class TripletSumZero {

    // optimized Time: O(n * log n) Space: O(1)
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

    // Brute force cubic Time: O(n^3) Space: O(1)
    public List<List<Integer>> findTriplets2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        list.add(triplet);
                    }
                }
            }
        }
        return list;
    }

    // brute force slightly optimized Time: O(n^2) Space: O(n)
    public List<List<Integer>> findTriplets3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int target = (nums[i] + nums[j]) * -1;
                if(set.contains(target)) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(target);
                    triplets.add(triplet);
                }

            }
        }
        return triplets;
    }
}
