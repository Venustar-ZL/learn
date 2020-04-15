package stringTest;

/**
 * @ClassName: MergeSort
 * @Description: 归并排序
 * @Date: 2020-03-23 14:03
 * @Author: ZhangLei
 * version: 1.0
 **/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int l = 0;
        int r = arr.length - 1;
        mergeSort(arr, l ,r);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        int mid = l + ((r - l) >> 1);
        if (l < r) {
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[arr.length];
        int p1 = l, p2 = mid + 1, k = l;
        while (p1 <= mid && p2 <= r) {
            temp[k++] = arr[p1] >= arr[p2] ? arr[p2++] : arr[p1++];
        }
        while (p1 <= mid) {
            temp[k++] = arr[p1++];
        }
        while (p2 <= r) {
            temp[k++] = arr[p2++];
        }
        // 复制回原数组
        for (int i = l; i <= r; i++) {
            arr[i] = temp[i];
        }
    }
}
