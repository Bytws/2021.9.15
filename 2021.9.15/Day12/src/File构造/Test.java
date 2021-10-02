package File构造;
import java.io.File;
public class Test {
    public static void main(String[] args) {
        //创建File对象
        //表示D:\C#JAVAPython\JAVA\heima\course\day11-线程状态、等待与唤醒、Lambda表达式、Stream流\File
    File file1 = new File("D:\\C#JAVAPython\\JAVA\\heima\\course\\day11-线程状态、等待与唤醒、Lambda表达式、Stream流\\File\\游泳池.jpg");
    File file2 = new File("D:\\C#JAVAPython\\JAVA\\heima\\course\\day11-线程状态、等待与唤醒、Lambda表达式、Stream流\\File","游泳池.jpg");
    File parent = new File("D:\\C#JAVAPython\\JAVA\\heima\\course\\day11-线程状态、等待与唤醒、Lambda表达式、Stream流\\File");
    File file3 = new File(parent,"游泳池.jpg");

        System.out.println("File1:"+file1);
        System.out.println("File2:"+file2);

    }
}
