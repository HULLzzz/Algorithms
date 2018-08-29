import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:
 * @Description:一次比较两个相邻的数，将小数放前面，大数放后面
 *              第一趟，比较第1和第2个数，再比较第2和第3个数，直到最后一位，此时最后一位是最大的数，第二趟同样，比较到倒数第二位
 *
 * @params:
 * @Data: Created in  10:57 2018/8/25
 * @Modified By:
 */
public class BubbleSort {
    public static void BubbleSort(int[] array){
        int tmp;
        for (int i = 0;i<array.length-1;i++){
            //冒泡的趟数
            for (int j = 0;j<array.length-i-1;j++){
                if (array[j+1]<array[j]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2,4,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
