package LinkedHashMap;

import java.util.LinkedHashMap;

public class Demo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("黄晓明", "杨颖");
        map.put("文章", "马伊琍");
        map.put("文章", "要读");
        map.put("谢霆锋", "王菲");
        System.out.println(map);
    }
}
