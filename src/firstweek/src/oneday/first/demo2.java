package oneday.first;

import java.util.HashMap;

/**
 * @author : Jayleonc
 * @date : 2021-11-02 14:49
 */
public class demo2 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[0], 0);
            if (map.containsKey(nums[i + 1])) {
                return true;
            }
            map.put(nums[i + 1], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 9, 2};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
}
