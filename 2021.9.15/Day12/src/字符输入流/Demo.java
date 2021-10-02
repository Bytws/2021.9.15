package 字符输入流;

import java.io.FileReader;

public class Demo {
    public static void main(String[] args) throws Exception{
        //读取单个字符流数据
        FileReader fr = new FileReader("Day12\\aaa\\a.txt");
        int a;
        while ((a=fr.read())!=-1){
            System.out.print((char) a);
        }
        fr.close();
    }
}
