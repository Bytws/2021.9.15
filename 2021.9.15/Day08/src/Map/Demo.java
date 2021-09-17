package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
       map常用方法：
       public V put(K key, V value) 把指定键与值添加到Map集合中
       public V remove(Object key) 把指定键对应的键值对在集合中删除，并返回值
       public boolean containsKey(Object key) 判断集合中是否有此键
       public Set<K> keySet() 把Map集合中所有的键，存储的Set集合中去
       public Set<Map.Entry<K,V>> entrySet() 把Map集合中所有键值对存储到Set集合中去
       put int size() 获取键值对个数

 */

public class Demo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");

        System.out.println(map);

//        String a = map.remove("文章");
//        System.out.println(a);  //返回值马伊利
//
//        String s = map.get("谢霆锋");
//        System.out.println(s); //得到值王菲
//
//        boolean a1 = map.containsKey("黄晓明");
//        System.out.println(a1); //有这个键 返回true
//
//        boolean a2 = map.containsValue("王菲");
//        System.out.println(a2);  //检查集合中有没有指定的值，有返回true
//
//        System.out.println(map.size()); //获取键值对个数
//        Set<String> s = map.keySet();
//        System.out.println(s); //获取键值对中所有的键
//
//        Collection<String> s1 = map.values();
//        System.out.println(s1); //获取键值对中所有的值
//
//        Set<Map.Entry<String, String>> s2 = map.entrySet();
//        System.out.println(s2);//获取键值对

        Set<String> s = map.keySet();

        for (String s1 : s) {
            System.out.println(s1+map.get(s1));
        }

        Set<Map.Entry<String, String>> s1 = map.entrySet();
        for (Map.Entry<String, String> ele : s1) {
            System.out.println(ele.getKey()+","+ele.getValue());
        }

    }
}
