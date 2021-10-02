package 递归;

import java.io.File;

public class 文件搜索 {
    public static void main(String[] args) {
        File file = new File("Day12\\src");
        findJavaFile(file);

    }
    public static void findJavaFile(File file){
         //获取该文件夹路径下的所有子文件和子文件夹
        File[] fileArr = file.listFiles();
        //循环遍历fileArr数组获取每一个子文件和子文件夹
        if(fileArr != null){
            for (File file1 : fileArr) {
                //判断 如果file1是文件，并且以Java结尾，就打印输出
                if(file1.isFile()&&file1.getName().endsWith(".java")){
                    System.out.println(file1);
                }
                //如果是文件夹，就继续获取所有
                if(file1.isDirectory()){
                    findJavaFile(file1);
                }
            }
        }
    }
}
