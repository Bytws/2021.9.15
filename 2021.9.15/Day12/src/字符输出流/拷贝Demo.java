package 字符输出流;

import java.io.FileReader;
import java.io.FileWriter;

public class 拷贝Demo {
    public static void main(String[] args) throws Exception{
         FileReader fr = new FileReader("Day12\\aaa\\a.txt");
         FileWriter fw = new FileWriter("Day12\\aaa\\d.txt");
//        一次读一个拷贝
//        int len;
//
//        while ((len = fr.read())!=-1){
//            fw.write(len);
//        }
//        fw.close();
//        fr.close();
        //一次读个数组拷贝
        char[] chs = new char[3];

        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fw.close();
        fr.close();
    }
}
