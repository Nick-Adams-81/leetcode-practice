import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;
import ArraysAndHashing.TwoSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram isAnagram = new IsAnagram();
        TwoSum twoSums = new TwoSum();
        int[] dups = {1,2,3,4};
        int[] nums = {3,4,5,6};
        String s1 = "anagram";
        String s2 = "nagarmm";
        System.out.println(duplicate.duplicate(dups));
        System.out.println(isAnagram.isAnagram(s1, s2));
        System.out.println(Arrays.toString(twoSums.twoSum(nums, 7)));


        }

}