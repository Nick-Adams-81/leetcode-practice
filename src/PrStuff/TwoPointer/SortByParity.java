package PrStuff.TwoPointer;

public class SortByParity {

    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            if (arr[left] % 2 == 0) left++;
            else if (arr[right] % 2 == 1) right--;
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
