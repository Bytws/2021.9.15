package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread extends Thread{
    public static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }
}
