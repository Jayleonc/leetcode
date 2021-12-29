package 正常做题.src.判定是否互为字符重排;

import java.util.Arrays;

/**
 * @author : Jayleonc
 * @date : 2021-12-09 15:58
 */
public class Main {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        Arrays.asList(chars1);
        char[] chars2 = s2.toCharArray();
        Arrays.asList(chars2);
        return true;
    }
}
