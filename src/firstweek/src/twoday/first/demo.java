package twoday.first;

import java.util.Arrays;

/**
 * @author : Jayleonc
 * @date : 2021-11-03 14:43
 */
public class demo {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
