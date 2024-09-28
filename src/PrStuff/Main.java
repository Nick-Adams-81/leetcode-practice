package PrStuff;
import PrStuff.TwoPointer.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        ValidPalindrome validPalindrome = new ValidPalindrome();
        SortByParity sortByParity = new SortByParity();
        TwoSum twoSum = new TwoSum();
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();

        int[] nums = {5,1,2,4,3,6,9,8,7};
        int[] nums2 = {1, 3, 6 ,8};
        int[] nums3 = {2, 4, 6 ,8};
        int[] nums4 = {1, 3, 5, 7};
        sortByParity.printArray(nums);
        sortByParity.sort(nums);
        sortByParity.printArray(nums);

        int[] result = mergeTwoSortedArrays.merge(nums3, nums4);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(twoSum.twoSum(nums2, 11)));
        System.out.println(validPalindrome.valid("A man, a plan, a canal: Panama!"));
        System.out.println(reverseString.reverse("hello world"));

    }
}
