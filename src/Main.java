import ArraysAndHashing.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram isAnagram = new IsAnagram();
        TwoSum twoSums = new TwoSum();
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        TopKFrequentElements frquentElements = new TopKFrequentElements();
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] dups = {1,2,3,4};
        int[] nums = {3,4,5,6};
        String s1 = "anagram";
        String s2 = "nagarmm";
        int[] elements = {1,2,2,3,3,3};
        int[] product = {1,2,4,6};
        String[] groups = {"hello", "olleh", "hi", "ih", "lolhe", "car", "rac", "arc"};
        System.out.println(duplicate.duplicate(dups));
        System.out.println(isAnagram.isAnagram(s1, s2));
        System.out.println(Arrays.toString(twoSums.twoSum(nums, 7)));
        System.out.println(groupAnagrams.groupAnagrams(groups));
        System.out.println(Arrays.toString(frquentElements.topKFrequent(elements, 2)));
        System.out.println(Arrays.toString(productOfArrayExceptSelf.product(product)));


        }

}