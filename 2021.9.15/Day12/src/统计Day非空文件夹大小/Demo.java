package 统计Day非空文件夹大小;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        //遍历一个文件夹计算文件夹大小
        File file = new File("Day12\\aaa\\bbb");
        long sum = findfile(file);
        System.out.println(sum);

    }
    public static long findfile(File file){
        long sum=0;
        File[] list = file.listFiles();
        if(list!=null){
            for (File file1 : list) {
                sum+=file1.length();
            }
        }
        return sum;
    }
}
