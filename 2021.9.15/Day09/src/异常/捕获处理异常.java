package 异常;


import java.text.SimpleDateFormat;
import java.util.Date;

public class 捕获处理异常 {
    public static void main(String[] args) {
        try {
            System.out.println("try开始");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sdf.parse("1999-10月-10");
            System.out.println("try结束");
        }catch (Exception e){
            System.out.println("异常的描述信息"+e.getMessage());
        }


    }
}
