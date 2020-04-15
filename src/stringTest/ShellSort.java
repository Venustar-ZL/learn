package stringTest;

/**
 * @ClassName: ShellSort
 * @Description: 希尔排序
 * @Date: 2020-03-23 17:31
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        shellSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void shellSort(int[] arr) {
        int len = arr.length;
        int gap = len >> 1;
        while (gap > 0) {
            for (int i = 0; i < len / 2; i++) {
                if (arr[i] > arr[i + gap]) {
                    swap(arr, i, i + gap);
                }
            }
            gap = gap >> 1;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
