package PrStuff.BinarySearch;

public class FirstBadCommit {

    public int firstBadCommit(int[] arr, int n) {
        int left = 0;
        int right = arr.length -1;
        while(left +1 < right) {
            int mid = left + (right - left) / 2;
            if(mid > n) right = mid;
            else if(mid < n) left = mid;
            else return mid;
        }
        return -1;
    }
}
