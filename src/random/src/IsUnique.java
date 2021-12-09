import java.util.HashMap;

/**
 * @author : Jayleonc
 * @date : 2021-11-11 10:27
 */
public class IsUnique {
    public static void main(String[] args) {
        String s = "leetcode";
        String unique = maxStr(s);
        System.out.println(unique);
    }

    public static boolean isUnique(String string) {
        String[] split = string.split("");
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < split.length - 1; i++) {
            map.put(0, split[0]);
            if (map.containsValue(split[i + 1])) {
                return false;
            }
            map.put(i + 1, split[i + 1]);
        }
        return true;
    }

    public static String maxStr(String s) {
        String[] split = s.split("");
        String pox = "";
        int index = 1;
        HashMap<String, Integer> map = new HashMap<>(1 );
        map.put(split[0], 1);
        for (int i = 1; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                Integer integer = map.get(split[i]);
                integer += 1;
                map.put(split[i], integer);
                if (integer >= index) {
                    index = integer;
                    pox = split[i];
                }
            } else {
                map.put(split[i], 1);
            }
        }
        return pox + ":" + index;
    }
}
