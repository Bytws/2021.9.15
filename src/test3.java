public class test3 {
    public static void main(String[] args) {
        int[] arr = {12,45,98,40,37};

        System.out.println("数组最大数为:"+GetMax(arr));
    }
    public static int GetMax(int[]arr){
        int max=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
