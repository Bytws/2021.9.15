package 等待唤醒机制案例包子;

public class Demo {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建包子铺线程，启动
        new BaoZiPu(bz).start();
        //创建吃货线程，启动
        new ChiHuo(bz).start();
    }
}
