/**
 * @Author:
 * @Description:选择排序：通过比较将最小的数字选出来和第一个放在第一个数字之前
 * @params:
 * @Data: Created in  9:27 2018/8/25
 * @Modified By:
 */
public class Selection {
    public static void selectionSort(int[] array){
        //有辅助内存
        int[] newArray = new int[array.length];
        int min;
        for (int i = 0;i<array.length;i++){
            min = array[i];
            for (int j = i;j<array.length;j++){
                if (array[j] < min) {
                    min = array[j];
                    newArray[i] = array[j];
                }
            }
        }
    }

    public static void selectionSort2(int[] array){
        for (int i = 0;i<array.length - 1;i++){
            //做第i趟排序
            int k = i;
            for (int j = k + 1;j<array.length;j++){
                //对剩下的数字中找出最小的数字
                if (array[j]<array[k]){
                    k = j;
                }
            }
            if (k != i) {
                int tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{-2,4,1,5,3,4};
        int[] array = new int[]{1,2,3,4};
        selectionSort2(array);
        for (int num:array){
            System.out.print(num);
        }
    }
}
