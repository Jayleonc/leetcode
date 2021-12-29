package 程序员面试金典;

import java.util.HashMap;

/**
 * @author : Jayleonc
 * @date : 2021-12-22 23:34
 * 第九章 1.1题
 * 判断字符是否唯一
 */
public class Nine1d1 {
    public static void main(String[] args) {
        String s = "string";
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>(10);
        for (int i = 1; i < chars.length; i++) {
            map.put(chars[0], 0);
            if (map.containsKey(chars[i])) {
                System.out.println("该字符串不唯一");
            }
            map.put(chars[i], i);
        }
    }
}
