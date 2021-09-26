package ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Mythread extends Thread{
    public static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            map.put(i,i);
        }
        System.out.println("结束");
    }
}
