import ArraysAndHashing.*;
import Stack.DailyTemps;
import Stack.GenerateParentheses;
import Stack.ValidParentheses;
import Strings.LongestCommonPrefix;
import Strings.RomanToInt;
import TwoPointers.ContainerWithMostWater;
import TwoPointers.MaxArea;
import TwoPointers.TwoSum2;
import TwoPointers.ValidPalindrome;
import LinkedList.RevLL;

import java.util.Arrays;
import java.util.LinkedList;

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
        ValidPalindrome validPalindrome = new ValidPalindrome();
        TwoSum2 twoSum2 = new TwoSum2();
        MaxArea maxArea = new MaxArea();
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        ValidParentheses validParentheses = new ValidParentheses();
        GenerateParentheses generateParentheses = new GenerateParentheses();
        DailyTemps dailyTemps = new DailyTemps();
        RomanToInt romanToInt = new RomanToInt();
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        RevLL ll = new RevLL(3);
        ll.append(4);
        ll.append(5);
        ll.removeLast();




        ll.printList();
        ll.printHead();
        ll.printTail();
        ll.printLength();

        System.out.println(ll.get(1));
        ll.reverse();
        ll.printList();
        System.out.println();
        int[] dups = {1,2,3,4};
        int[] nums = {3,4,5,6};
        String s1 = "anagram";
        String s2 = "nagarmm";
        int[] elements = {1,2,2,3,3,3};
        int[] product = {1,2,4,6};
        int[] newNums = {1,2,3,4};
        int[] area = {1,7,2,5,4,7,3,6};
        int[] water = {0,2,0,3,1,0,1,3,2,1};
        int[] temps = {30, 38, 30, 36, 35, 40, 28};
        String[] groups = {"hello", "olleh", "hi", "ih", "lolhe", "car", "rac", "arc"};
        String[] prefix = {"dog", "racecar", "car"};


//        System.out.println(duplicate.duplicate(dups));
//        System.out.println(isAnagram.isAnagram(s1, s2));
//        System.out.println(Arrays.toString(twoSums.twoSum(nums, 7)));
//        System.out.println(groupAnagrams.groupAnagrams(groups));
//        System.out.println(Arrays.toString(frquentElements.topKFrequent(elements, 2)));
//        System.out.println(Arrays.toString(productOfArrayExceptSelf.product(product)));
//        System.out.println(validPalindrome.isValid("A man, a plan, a canal: Panama"));
//        System.out.println(Arrays.toString(twoSum2.twoSum(newNums, 3)));
//        System.out.println(maxArea.maxArea(area));
//        System.out.println(containerWithMostWater.maxWater(water));
//        System.out.println(validParentheses.isValid("[]{}{"));
//        System.out.println(generateParentheses.generateParentheses(3));
//        System.out.println(Arrays.toString(dailyTemps.dailyTemps(temps)));
        System.out.println(romanToInt.romanToInt("III"));
        System.out.println(romanToInt.romanToInt("IV"));
        System.out.println(longestCommonPrefix.longestCommonPrefix(prefix));


        }

}