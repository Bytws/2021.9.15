package 等待唤醒机制案例包子;

public class ChiHuo extends Thread{
    BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //吃货线程任务代码
     while (true){
         synchronized (bz) {
             if (bz.flag == false) {
                 System.out.println("吃货线程：没包子   准备进入无限等待");
                 try {
                     bz.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             if (bz.flag == true) {
                 System.out.println("吃货线程：正在吃" + bz.xianer + "包子");
                 bz.flag = false;
                 bz.notify();
                 System.out.println("吃货线程：包子吃完了==============");
             }

         }
     }
    }
}
