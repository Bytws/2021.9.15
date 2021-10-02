package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class 字节输出流Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Day12\\aaa\\a.txt");
        FileOutputStream f = new FileOutputStream(file);

    }
}
