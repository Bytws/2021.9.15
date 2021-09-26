package AtomicIntegerArray;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MyThrear extends Thread{
//    public static int[] arr = new int[1000];
public static AtomicIntegerArray arr  = new AtomicIntegerArray(1000);
    @Override
    public void run() {
        for (int i = 0; i < arr.length(); i++) {
            arr.getAndAdd(i,1);
        }
    }
}
