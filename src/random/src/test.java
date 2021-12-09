import java.util.*;

/**
 * @author : Jayleonc
 * @date : 2021-11-26 15:35
 */
public class test {
    public static void main(String[] args) {

        List<Map<String, String>> module = new ArrayList<>();
        Map<String, String> m = new HashMap<>();
        m.put("lastModificationTime", "1604293871");
        m.put("status", "0");
        m.put("appId", "88");
        m.put("appName", "粤商通");
        m.put("moduleId", "1.1");
        m.put("moduleCode", "LicenseCotrller");
        m.put("moduleName", "1.1证照目录管理");
        m.put("moduleDesc", "123");
        m.put("parentModuleName", "证照运营");
        module.add(m);

        List<Map<String, String>> listMaps = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("app_id", "66");
        map1.put("app_name", "QQ");
        listMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("app_id", "88");
        map2.put("app_name", "粤商通");
        listMaps.add(map2);

        for (Map<String, String> map : listMaps) {
            for (String s : map.keySet()) {
                System.out.print(map.get(s) + "  ");
            }
        }
        System.out.println();
        System.out.println("========================");
        for (int i = 0; i < listMaps.size(); i++) {
            Map<String, String> map = listMaps.get(i);
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String string = (String) iterator.next();
                System.out.println(map.get(string));
            }
        }
        System.out.println("++++++++++++++++++++++++++++");
        String key;
        String value;
        for (Map<String, String> map : listMaps) {
            for (Map.Entry<String, String> item : map.entrySet()) {
                key = item.getKey();
                value = item.getValue();
                System.out.println(key + ": " + value);
            }
        }

        System.out.println("++++++++++++++++++++++++++++");
        for (Map<String, String> map : module) {
            for (Map.Entry<String, String> item : map.entrySet()) {
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }


    }
}
