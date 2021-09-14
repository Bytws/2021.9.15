package Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();

        col.add("谷文杰");
        col.add("刘家衫");
        col.add("郭陆祥");

        Iterator<String> iterator = col.iterator();
        while (iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }
    }
}
