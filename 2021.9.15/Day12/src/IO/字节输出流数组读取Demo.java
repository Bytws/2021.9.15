package IO;

import java.io.FileInputStream;
import java.util.Arrays;

public class 字节输出流数组读取Demo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Day12\\aaa\\a.txt");

        byte[] bys = new byte[2];
        int len1 = fis.read(bys); //返回的是字节个数
        System.out.println(new String(bys,0,len1));
        System.out.println(len1);

        int len2 = fis.read(bys); //返回的是字节个数
        System.out.println(new String(bys,0,len2));
        System.out.println(len2);

        int len3 = fis.read(bys); //返回的是字节个数
        System.out.println(new String(bys,0,len3));
        System.out.println(len3);
    }
}
