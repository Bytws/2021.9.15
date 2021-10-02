package 字符输入流;

import java.io.FileReader;

public class Demo1 {
    public static void main(String[] args)throws Exception {
        //读取多个字符流数据
        FileReader fr = new FileReader("Day12\\aaa\\a.txt");
        char[] chs = new char[3];
        int len;
        while ((len=fr.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        fr.close();
    }
}
