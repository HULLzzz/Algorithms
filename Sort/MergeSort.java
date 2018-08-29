import java.util.Arrays;

/**
 * @Author:
 * @Description:归并算法：将数组划分为若干个小数组使用递归进行归并排序
 * @params:
 * @Data: Created in  10:15 2018/8/26
 * @Modified By:
 */
public class MergeSort {

    public static void Sort(int[] a ){
        if (a.length > 0) {
            mergeSort(a,0,a.length-1);
        }
    }
    public static void mergeSort(int[] a,int left,int right){
        if (left < right) {
            int middle = (left+right)/2;
            mergeSort(a,left,middle);
            mergeSort(a,middle+1,right);
            Merge(a,left,middle,right);
        }
    }

    private static void Merge(int[] a, int left, int middle, int right) {
        int[] tmpArray = new int[a.length];
        int rightStart = middle+1;
        int tmp = left;
        int third = left;
        while (left<=middle&&rightStart<=right){
            if (a[left]<=a[rightStart]){
                tmpArray[third++] = a[left++];
            }else {
                tmpArray[third++] = a[rightStart++];
            }
        }
        //左边还有数据
        while (left<=middle){
            tmpArray[third++] = a[left++];
        }
        //右边还有数据
        while (rightStart <= right) {
            tmpArray[third++] = a[rightStart++];
        }

        while (tmp <= right) {
            a[tmp] = tmpArray[tmp];
            tmp++;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,2,4,1,5,2,3};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }

}
