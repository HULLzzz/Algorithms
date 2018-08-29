/**
 * @Author:
 * @Description:插入排序
 *              thinking:将指针指向某个元素，假设该元素左侧的元素全部有序，将元素抽取出来
 *              按照从右向左的顺序分别和左边的元素比较，遇到比他大的元素将该元素后移
 *              此时会出现一个空位，将元素插入到空位中，该元素的左侧的元素比他都小，右侧的元素比他都大
 *              指针向后移动一位，重复上述操作
 *              code:需要两层循环，第一层循环index表示上述例子中的指针，遍历每一个元素，第二层循环从index-1开始向左遍历
 *              每一个元素和i元素进行比较，直到j处的元素小于i处的元素或者位置<0；遍历从i到j的每一个元素使其后移，将index处的元素放在leftindex处的空位
 *
 * @params:
 * @Data: Created in  9:44 2018/8/25
 * @Modified By:
 */
public class Insertion {
    public static void doInsertSort(int[] array){
        if (array.length == 0||array==null) {
            System.out.println("wrong input");
        }

        for (int index = 1;index<array.length;index++){
            int tmp = array[index]; //做比较的数据
            int leftindex = index - 1;
            while (leftindex >= 0 && array[leftindex] > tmp) {
                array[leftindex+1] = array[leftindex];
                leftindex--;
            }
            array[leftindex+1] = tmp;
        }
    }

    //二分法插入排序
    public static void BinaryInsertSort(int[] array){
        for (int i = 0;i<array.length;i++){
            int tmp = array[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            while (left<=right){
                mid = (left+right)/2;
                if (tmp < array[mid]) {
                    right = mid - 1;
                }else
                    left = mid + 1;
            }
            for (int j = i - 1;j>=left;j--){
                array[j+1] = array[j];
            }
            if (left!=i){
                array[left] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,5,3,1,3};
        doInsertSort(array);
        for (int num : array){
            System.out.print(num + " ");
        }
    }
}
