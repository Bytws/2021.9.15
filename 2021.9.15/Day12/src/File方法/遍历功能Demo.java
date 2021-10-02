package File方法;

import java.io.File;

public class 遍历功能Demo {
    public static void main(String[] args) {
        //路径存在
        File file1 = new File("Day12\\aaa");

        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] file2 = file1.listFiles();
        for (File filepath : file2) {
            System.out.println(filepath);
        }
        //路径不存在
        File file3 = new File("Day12\\bbb");
        String[] list1 = file3.list();
        for (String s : list1) {
            System.out.println(s);
        }

        File[] file4 = file3.listFiles();
        for (File filepath : file4) {
            System.out.println(filepath );
        }
    }
}
