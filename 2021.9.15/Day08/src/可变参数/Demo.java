package 可变参数;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3");
        System.out.println(list);

        System.out.println("================================");
        int num = 10;
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;
        int num4 = 50;
        int[] arr = {num, num1, num2, num3, num4};
       method(arr);
       method(num,num1,num2,num3,num4);
    }

    public static void method(int... num) {
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i]);

        }
        System.out.println();
    }
}
