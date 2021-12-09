package 最长公共前缀;

/**
 * @author : Jayleonc
 * @date : 2021-12-06 22:51
 */
public class Main {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        int cols = strs[0].length(); // 列数
        int rows = strs.length; // 行数
        // 按列访问，一列一列进行对比，先列后行
        for (int i = 0; i < cols; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < rows; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"leet", "leetcode", "leets", "leed"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

        String a = "Jayleonc";
        System.out.println(a.substring(0, 3));

    }

}
