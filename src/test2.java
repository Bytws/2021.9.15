import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        for (int end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        arrprint(arr);
    }

    public static void arrprint(int[] arr) {
        System.out.print('[');
        for (int i = 0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println(']');
    }
}
