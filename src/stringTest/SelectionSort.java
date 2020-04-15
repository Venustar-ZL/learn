package stringTest;

import javax.sound.midi.Soundbank;

/**
 * @ClassName: SelectionSort
 * @Description: 选择排序
 * @Date: 2020-03-20 17:48
 * @Author: ZhangLei
 * version: 1.0
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2 , 5, 3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr) {
        // 记录最小值的位置
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
