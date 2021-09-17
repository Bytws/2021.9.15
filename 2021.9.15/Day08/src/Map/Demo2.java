package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);

            if(map.containsKey(c)){
                Integer value = map.get(c);
                map.put(c,value+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
