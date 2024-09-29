package PrStuff.TwoPointer;

public class RemoveValue {

    public int removeValue(int[] arr, int value) {
        int read = 0;
        int write = 0;
        while(read < arr.length) {
            if(arr[read] != value) {
                arr[write] = arr[read];
                write++;
            }
            read++;
        }
        return write;
    }
}
