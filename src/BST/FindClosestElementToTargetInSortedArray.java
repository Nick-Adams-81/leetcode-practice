package BST;

public class FindClosestElementToTargetInSortedArray {

    public int findClosest(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) start = mid;
            else end = mid;
        }
        if(Math.abs(target - nums[start]) <= Math.abs(target - nums[end])) return start;
        else return end;
    }
}
