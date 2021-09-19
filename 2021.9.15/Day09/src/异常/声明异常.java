package 异常;

import java.text.ParseException;

public class 声明异常  {
    public static void main(String[] args) throws ParseException{
        method1 ();
    }
    public static void method1() throws ParseException{
        //产生异常
        throw  new ParseException("解析异常",10);
    }
}
