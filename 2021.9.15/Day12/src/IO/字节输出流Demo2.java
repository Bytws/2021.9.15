package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流Demo2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream fos = new FileOutputStream(new File("Day12\\aaa\\a.txt"),true);
        fos.write(97);
        System.out.println("开始");
        fos.write(98);

    }
}
