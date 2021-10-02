package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 字节拷贝 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Day12\\aaa\\游泳池.jpg");
        FileOutputStream fos = new FileOutputStream("Day12\\aaa\\b.jpg");
//        单个拷贝
//        int len;
//        while ((len=fis.read())!=-1){
//            fos.write(len);
//        }
        byte[] bys=new byte[8192];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
    }
}
