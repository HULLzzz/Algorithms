import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:
 * @Description:基数排序，先基于个位进行排序，再基于十位进行排序。。。
 * @params:
 * @Data: Created in  15:00 2018/8/26
 * @Modified By:
 */
public class basicSort {
    public static void basicSort(int[] array){
        //首先要知道最大值的位数
        int max = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        int times = 0;
        while (max>0){
            max = max/10;
            times++;
        }
        //创建10个小数组用于排序
        List<ArrayList> queue = new ArrayList<>();
        for (int i = 0;i<10;i++){
            ArrayList q = new ArrayList();
            queue.add(q);
        }
        for (int i = 0;i<times;i++){
            for(int j = 0;j< array.length;j++){
                //对数组中的每个元素进行排序
                int x = array[j]%(int)Math.pow(10,i+1)/(int)Math.pow(10,i);
                ArrayList q = queue.get(x);
                q.add(array[j]);
                queue.set(x,q);

            }
            //收集
            int count = 0;
            for (int n = 0;n<10;n++){
                while (queue.get(n).size() > 0) {
                    ArrayList<Integer> q = queue.get(n);
                    array[count] = q.get(0);
                    q.remove(0);
                    count++;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{11,32,24,123,221,123,1,3};
        basicSort(array);
        System.out.println(Arrays.toString(array));
    }


}
