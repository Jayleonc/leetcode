package 正常做题.src.两数相加;

import java.util.*;

/**
 * @author : Jayleonc
 * @date : 2021-12-08 21:52
 */
public class hashmap {
    public static void main(String[] args) {
        int[] ints = new int[]{11, 15, 2, 7};
        int target = 9;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            if (map.containsKey(ints[i])) {
                System.out.println(Arrays.toString(new int[]{map.get(ints[i]), i}));
            } else {
                map.put(target - ints[i], i);
            }
        }

    }
}
