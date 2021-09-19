package 算法;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {7,6,18,4,3,2};

//  选择排序普通版，直接两两交换
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] =temp;
//                }
//            }
//        }

        //索引交换，优化
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
