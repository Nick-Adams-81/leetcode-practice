package PrStuff.TwoPointer;

import java.util.*;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            if(set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] intersection = new int[set2.size()];
        int i = 0;
        for(int num : set2) {
            intersection[i++] = num;
        }
        return intersection;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
         }
        int[] result = new int[intersection.size()];
        for(int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        return result;
    }
}
