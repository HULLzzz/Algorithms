import java.util.Arrays;

/**
 * @Author:
 * @Description:希尔排序：设置一个增量，进行局部数组排序，逐渐减小增量，将排序号的子数组进行插入排序，是对直接插入排序的优化
 *
 * @params:
 * @Data: Created in  11:14 2018/8/25
 * @Modified By:
 */
public class HeerSort {
    public static void heerSort(int[] arr){
        int d = arr.length/2;  //设置增量
        while (d>=1){
            for (int i = 0;i<arr.length;i++){
                //进行插入排序
                for (int j = i;j<arr.length - d;j = j+d){
                    if (arr[j]>arr[j+d]){
                        int tmp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = tmp;
                    }
                }
            }
            d--;
        }
//        while (true) {
//            for(int i = 0;i<d;i++){
//                for (int j=i;j+d < arr.length;j+=d){
//                    int tmp;
//                    if (arr[j+d]<arr[j]){
//                        tmp = arr[j];
//                        arr[j] = arr[j+d];
//                        arr[j+d] = tmp;
//                    }
//                }
//            }
//            if (d==1) break;
//            d--;
//        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,1,5,2,5,3,2};
        heerSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
