package 递归;

public class 阶乘 {
    public static void main(String[] args) {
        System.out.println(jiechen(10));
    }
    public static int jiechen(int n){
        if(n==1){
            return 1;
        }
        return n*jiechen(n-1);
    }
}
