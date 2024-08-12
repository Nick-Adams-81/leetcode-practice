package TwoPointers;

public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            int len = right - left;
            if(height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * len);
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * len);
                right--;
            }
        }
        return maxArea;
    }
}
