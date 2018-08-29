import java.util.Arrays;

/**
 * @Author:
 * @Description:快排：在数组中选取一个主元，将数组根据主元划分为两部分，一部分大于主元，一部分小于主元，对这两部分分别使用递归
 * @params:
 * @Data: Created in  9:21 2018/8/26
 * @Modified By:
 */
public class quickSort {
    public static void quick(int[] array){
        if (array.length <= 0 || array == null) {
            System.out.println("wrong input");
        }
        if (array.length > 0) {
            quickSort(array,0,array.length-1);
        }
    }
    public static void quickSort(int[] array,int low,int high){
        if (low<high){
            int middle = getMiddle(array,low,high);
            quickSort(array,0,middle);
            quickSort(array,middle+1,high);
        }
    }

    private static int getMiddle(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low<high&&array[high]>=tmp){
                high--;
            }
            array[low] = array[high];
            while (low<high&&array[low]<=tmp){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7,4,3,6,1,2,4};
        quick(array);
        System.out.println(Arrays.toString(array));
    }


}
