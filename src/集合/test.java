package 集合;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        array.add("world");
        array.add("sss");
        array.add("aaa");
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
