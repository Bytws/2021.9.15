package 算法;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {10, 14, 21, 38, 45, 47, 53, 81, 87, 99};

        int num = 45;
        int id = searchnum(arr, num);
        if(id == -1){
            System.out.println("未找到该元素");
        }else {
            System.out.println("该元素索引为："+id);
        }
    }

        public static int searchnum  ( int[] arr, int num){
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int mid = (left + right) / 2;

                if (arr[mid] == num) {
                    return mid;
                } else if (arr[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }


}
