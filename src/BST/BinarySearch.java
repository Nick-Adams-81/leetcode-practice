package BST;

public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid;
            else if(arr[mid] < target) start = mid;
        }
        return -1;
    }
}
