package 集合嵌套;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaptoMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("it001", "迪丽热巴");
        map1.put("it002", "古力娜扎");

        Map<String, String> map2 = new HashMap<>();
        map2.put("it003", "蔡徐坤");
        map2.put("it004", "李易峰");

        Map<String, Map<String, String>> map = new HashMap<>();
        map.put("001", map1);
        map.put("002", map2);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Map<String, String> value = map.get(key);
            Set<String> keySet = value.keySet();
            for (String s : keySet) {
                String s2 = value.get(s);
                System.out.println(key+","+s+","+s2);
            }
        }
    }
}
