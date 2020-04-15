package stringTest;

/**
 * @ClassName: InsertSort
 * @Description: 插入排序
 * @Date: 2020-03-20 18:44
 * @Author: ZhangLei
 * version: 1.0
 **/
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int cur = arr[i + 1];
            int pre = i;
            while (pre >= 0 && cur < arr[pre]) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            // 将新元素插入到正确位置
            arr[pre + 1] = cur;
        }
    }

}
