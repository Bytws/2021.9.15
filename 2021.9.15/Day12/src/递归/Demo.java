package 递归;

public class Demo {
    static int count = 0;
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        count++;
        if(count == 10000) return;

        System.out.println("method方法");
        method();
    }
}
