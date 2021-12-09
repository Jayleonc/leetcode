package 两个数组的交集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Jayleonc
 * @date : 2021-11-28 17:59
 */
public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i : nums1) {
            list.add(i);
        }

        for (int i : nums2) {
            list2.add(i);
        }

        // 用于保留 arraylist 中在指定集合中也存在的那些元素，也就是删除指定集合中不存在的那些元素。
        list.retainAll(list2);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{8, 3, 6, 4, 0};
        int[] intersection = intersection(a, b);
        System.out.println(Arrays.toString(intersection));
    }
}
