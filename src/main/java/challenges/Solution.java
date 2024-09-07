package challenges;

import java.util.Arrays;

public class Solution {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static int removeElement(int[] nums, int val){
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[r] = nums[i];
                r++;
            }
        }
        return r;
    }
}
