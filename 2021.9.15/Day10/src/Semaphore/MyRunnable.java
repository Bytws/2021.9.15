package Semaphore;

public class MyRunnable implements Runnable{
    ClassRoom cr;

    public MyRunnable(ClassRoom cr) {
        this.cr = cr;
    }

    @Override
    public void run() {
        cr.into();
    }
}
