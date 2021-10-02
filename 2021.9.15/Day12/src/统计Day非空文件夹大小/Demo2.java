package 统计Day非空文件夹大小;

import java.io.File;

public class Demo2{
        public static void main(String[] args) {
        File file = new File("Day12\\src");
        long sum = findJavaFile(file);
            System.out.println(sum);


    }
    public static long findJavaFile(File file){
            long sum =0;
            long sum1 =0;
        //获取该文件夹路径下的所有子文件和子文件夹
        File[] fileArr = file.listFiles();
        //循环遍历fileArr数组获取每一个子文件和子文件夹
        if(fileArr != null){
            for (File file1 : fileArr) {
                //判断 如果file1是文件
                   sum+=file1.length();


                //如果是文件夹，就继续获取所有
                if(file1.isDirectory()){
                    sum1 = findJavaFile(file1);
                }
            }
        }
        return sum+sum1;
    }
}
