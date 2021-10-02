package 字符输出流;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter  ("Day12\\aaa\\b.txt");
        fw.write('a');
        fw.write('b');
        char[] chs = {'c','c','d'};
        fw.write(chs);
        char[] cchs = {'c','c','d','s'};
        fw.write(cchs,1,3);
        fw.close();
    }
}
