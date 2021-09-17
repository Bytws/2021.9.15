package 集合嵌套;

import java.util.ArrayList;
import java.util.List;

public class ListtoList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("王宝强");
        list1.add("贾乃亮");
        list1.add("陈羽凡");

        List<String> list2= new ArrayList<>();

        list2.add("马蓉");
        list2.add("李小璐");
        list2.add("白百合");

        List<List<String>> list3 = new ArrayList<>();

        list3.add(list1);
        list3.add(list2);

        for (List<String> str : list3) {
            for (String s : str) {
                System.out.println(s);
            }
            System.out.println("====");
        }
    }
}
