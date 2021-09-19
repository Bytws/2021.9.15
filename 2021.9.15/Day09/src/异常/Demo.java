package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
      int[] arr = {34, 12, 67};
      int num = getElement(arr,4);
        System.out.println("num:"+num);
        System.out.println("over ");
    }

    private static int getElement(int[] arr, int i) {
        int element = arr[i];
        return element;
    }
}
