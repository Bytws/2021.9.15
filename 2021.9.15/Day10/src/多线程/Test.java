package 多线程;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        while (true){
            if(MyThread.flag==true){
                System.out.println("结束死循环");
                break;
            }
        }

    }
}
