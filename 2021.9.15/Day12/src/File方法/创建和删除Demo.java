package File方法;

import java.io.File;
import java.io.IOException;

public class 创建和删除Demo {
    public static void main(String[] args) {
        File file1 = new File("Day12\\aaa\\b.txt");//这个文件不存在
//        System.out.println("文件是否存在:"+file1.exists());
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("文件是否存在:"+file1.exists());
        //System.out.println("文件是否删除成功:"+file1.delete());
        //File file2 = new File("Day12\\ccc");
        //System.out.println("空文件夹删除："+file2.delete());//可以删除空文件夹，非空则不能删除

        //创建文件夹
        File file3 = new File("Day12\\aaa\\ccc");
        System.out.println("文件夹是否创建成功:"+ file3.mkdir());


    }
}
