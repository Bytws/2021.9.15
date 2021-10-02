package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class 字节流拷贝图片 {
    public static void main(String[] args)  throws Exception {
        FileInputStream fis= new FileInputStream("Day12\\aaa\\游泳池.jpg");

        FileOutputStream fos = new FileOutputStream("Day12\\aaa\\bbb\\游泳池.jpg");
        byte[] bys = new byte[8192];

        int len;
        while ((len = fis.read(bys) )!= -1){
            fos.write(bys,0,len);
        }
        fos.close();//后创建的先关闭
        fis.close();
    }
}
