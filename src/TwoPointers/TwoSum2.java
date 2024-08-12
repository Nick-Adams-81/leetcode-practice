package TwoPointers;

public class TwoSum2 {

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left<right){
            int total = nums[left] + nums[right];
            if(total > target){
                right--;
            } else if(total< target){
                left++;
            } else {
                return new int[] {left+1, right+1};
            }
        }
        return new int[] {left +1, right +1};
    }
}
