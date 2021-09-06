import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("开始");
        System.out.println("请输入你要查询的月份:");
        int x = sc.nextInt();
        switch (x){
            case 12:
            case 2:
            case 1:
                System.out.println("冬季");
                break;
            case 5:
            case 4:
            case 3:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
