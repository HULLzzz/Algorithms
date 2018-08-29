import java.util.Arrays;

/**
 * @Author:
 * @Description:堆排序
 *              堆是完全二叉树可以用数组表示，普通二叉树用链表表示。
 *              最大堆：节点元素不小于左右孩子，左右孩子可不做要求，从下往上进行调整
 *              将最顶上的元素（最大元素）与末尾元素交换位置，再次进行堆调整，将堆顶元素和倒数第二位元素交换位置...
 * @params:
 * @Data: Created in  14:52 2018/8/25
 * @Modified By:
 */
public class HeapSort {
    public static void heapSort(int[] a){
        //创建大堆
        buildMaxHeap(a);
        for (int i = a.length-1;i>=1;i--){
           exchangeElements(a,0,i);  //交换顶点元素和最后一位元素
            maxHeap(a,i,0);      //调整最大堆
        }
    }

    private static void buildMaxHeap(int[] a) {
        int half = (a.length-1)/2;
        for (int i = half;i>=0;i--){
            maxHeap(a,a.length,i);
        }
//        for (int i = 0;i<=half;i++){
//            maxHeap(a,a.length,i);
//        }
    }

    //length 表示用来构建大堆的数组元素的数量，i表示构建开始的节点
    private static void maxHeap(int[] a, int length, int i) {
        int left = i*2+1;
        int right = i*2+2;
        int lagest = i;
        if (left<length&&a[left]>a[lagest]){
            lagest = left;
        }
        if (right<length&&a[right]>a[lagest]){
            lagest = right;
        }
        if (i!=lagest){
            exchangeElements(a,i,lagest);
            maxHeap(a,length,lagest);
        }
    }

    private static void exchangeElements(int[] a, int i, int lagest) {
        int tmp = a[i];
        a[i] = a[lagest];
        a[lagest] = tmp;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{3, 16, 17, 7, 8, 20};
        //heapSort(arr);
        maxHeap(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

}
