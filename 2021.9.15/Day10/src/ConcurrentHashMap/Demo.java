package ConcurrentHashMap;

import CopyOnWriteArrayList.MyThread;

public class Demo {
    public static void main(String[] args) {
        new Mythread().start();
        new Mythread().start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("集合个数:"+Mythread.map.size());

    }
}
