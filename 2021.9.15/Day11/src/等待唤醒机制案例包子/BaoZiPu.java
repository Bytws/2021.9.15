package 等待唤醒机制案例包子;

public class BaoZiPu extends Thread{
    BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
      while (true){
          synchronized (bz) {
              if (bz.flag == true) {
                  System.out.println("包子铺线程：由于有包子，准备进入无限等待");
                  try {
                      bz.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              if(bz.flag == false){
                  bz.xianer = "猪肉";
                  bz.flag = true;
                  //唤醒吃货线程
                  bz.notify();
                  System.out.println("包子铺线程：包子包好了，快来吃包子");
              }
          }
      }
    }
}
