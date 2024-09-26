package BST;

public class FindFirstPositionOfElementInSortedArray {

    public int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while(left +1 < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) right = mid;
            else if(arr[mid] < target) left = mid;
            else right = mid;
        }
        if(arr[left] == target) return left;
        if(arr[right] == target) return right;
        return -1;
    }
}
