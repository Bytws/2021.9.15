package 增强for循环;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("谷文杰");
        col.add("刘家衫");
        col.add("郭陆祥");

        for(String name : col){
            System.out.println(name);
        }

        String [] arr= {"谷文杰","刘家衫","郭陆祥"};
        for(String name : arr){
            System.out.println(name);
        }
    }
}
