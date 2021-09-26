package AtomicIntegerArray;

import 多线程.MyThread;
import 多线程.MyThread2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {

            new MyThrear().start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < MyThrear.arr.length(); i++) {
            System.out.println(MyThrear.arr.get(i)+"  ");
        }
    }
}
