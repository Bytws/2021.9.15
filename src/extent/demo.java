package extent;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int []arr={1,2,3};
        String newline =join(arr);
        System.out.println(newline);
    }
    public static String join(int []arr){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0;i<arr.length;i++){
             if(arr.length-1==i){
                 s.append(arr[i]);
             }else {
                 s.append(arr[i]+",");
             }
        }
        s.append("]");
        String a =s.toString();
        return a;
    }
}
