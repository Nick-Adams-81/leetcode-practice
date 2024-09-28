package PrStuff;
import PrStuff.TwoPointer.ReverseString;
import PrStuff.TwoPointer.SortByParity;
import PrStuff.TwoPointer.TwoSum;
import PrStuff.TwoPointer.ValidPalindrome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        ValidPalindrome validPalindrome = new ValidPalindrome();
        SortByParity sortByParity = new SortByParity();
        TwoSum twoSum = new TwoSum();

        int[] nums = {5,1,2,4,3,6,9,8,7};
        int[] nums2 = {1, 3, 6 ,8};
        sortByParity.printArray(nums);
        sortByParity.sort(nums);
        sortByParity.printArray(nums);


        System.out.println(Arrays.toString(twoSum.twoSum(nums2, 11)));
        System.out.println(validPalindrome.valid("A man, a plan, a canal: Panama!"));
        System.out.println(reverseString.reverse("hello world"));

    }
}
