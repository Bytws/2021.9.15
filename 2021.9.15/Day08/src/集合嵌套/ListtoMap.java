package 集合嵌套;

import java.util.*;

public class ListtoMap {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("it001","迪丽热巴");
        map1.put("it002","古力娜扎");

        Map<String,String> map2 = new HashMap<>();
        map2.put("it003","蔡徐坤");
        map2.put("it004","李易峰");

        List<Map<String,String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        for (Map<String, String> map : list) {
            Set<String> key = map.keySet();
            for (String s1 : key) {
                String s2 = map.get(s1);
                System.out.println(s1+"="+s2);
            }
            System.out.println("============");
        }
    }
}
