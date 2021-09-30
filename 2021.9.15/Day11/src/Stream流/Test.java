package Stream流;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //传统方法
        //将List集合中姓赵的过滤，在过滤赵中长度为3的，添加到新的集合
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("赵七是");
        System.out.println(list);
        //创建添加集合，过滤赵
        ArrayList<String> newlist = new ArrayList<>();

        for (String s : list) {
            if(s.startsWith("赵")){
                newlist.add(s);
            }
        }
        //创建添加集合，过滤长度3的赵
        ArrayList<String> new3list = new ArrayList<>();
        for (String s : newlist) {
            if(s.length()==3){
                new3list.add(s);
            }
        }
        System.out.println("list="+list);
        System.out.println("newlist="+newlist);
        System.out.println("new3list="+new3list);
      System.out.println("---------------");

        //用stream流简化操作
        //获得流,过滤，打印
       list.stream().filter(name -> name.startsWith("赵")).filter(name->name.length()==3).forEach(name->System.out.println(name));

    }
}
