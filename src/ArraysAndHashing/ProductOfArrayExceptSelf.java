package ArraysAndHashing;

public class ProductOfArrayExceptSelf {

    public int[] product(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] result = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = nums[i -1] * leftProduct[i -1];
        }
        for(int i = n -2; i >= 0; i--) {
            rightProduct[i] = nums[i +1] * rightProduct[i +1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }
}
