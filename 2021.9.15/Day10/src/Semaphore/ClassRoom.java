package Semaphore;

import java.util.concurrent.Semaphore;

public class ClassRoom {
    Semaphore sp = new Semaphore(2);
    public void into (){
        try {
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"：进入了教室");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":离开了教室");
        sp.release();
    }
}
