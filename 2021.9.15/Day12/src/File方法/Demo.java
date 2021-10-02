package File方法;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("Day12\\aaa\\游泳池.jpg");
        System.out.println(file1.getAbsoluteFile());//D:\program_code\2021.9.15\Day12\aaa\游泳池.jpg
        System.out.println(file1.getPath());//Day12\aaa\游泳池.jpg 注意这虽然和相对路径长得一样
                                            //但不是，是构造路径
        System.out.println(file1.getName());//获取文件名
        System.out.println(file1.length());//文件大小

        File file3 = new File("Day12\\aaa\\a.txt");
        System.out.println(file3.length());;
    }
}
