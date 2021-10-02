package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class 字节输入流读取单个数据Demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Day12\\aaa\\a.txt");
        while (true){
            int b = fis.read();
            if (b==-1){
                break;
            }else {
                System.out.print((char) b);
            }

        }
        fis.close();
    }
}
