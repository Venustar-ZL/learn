package stringTest;

/**
 * @ClassName: BubbleSort
 * @Description: 冒泡排序
 * @Date: 2020-03-20 17:31
 * @Author: ZhangLei
 * version: 1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
