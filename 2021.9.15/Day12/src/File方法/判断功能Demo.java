package File方法;

import java.io.File;

public class 判断功能Demo {
    public static void main(String[] args) {
        File file1 = new File("Day12\\aaa\\游泳池.jpg");
        System.out.println("file1表示的路径是否真实存在："+file1.exists());
        System.out.println("file1表示的路径是否是文件夹路径"+file1.isDirectory());
        System.out.println("file1表示的路径是否是文件路径"+file1.isFile());

        File file2 = new File("Day12\\aaa");
        System.out.println("file2表示的路径是否是文件夹路径"+file2.isDirectory());
    }
}
