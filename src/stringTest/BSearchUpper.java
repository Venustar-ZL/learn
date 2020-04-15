package stringTest;

/**
 * @ClassName:
 * @Description: 二分查找法找寻上界
 * @Date: 2020-03-30 17:00
 * @Author: ZhangLei
 * version: 1.0
 **/
public class BSearchUpper {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int upper = getUpper(arr, 5);
        System.out.println(arr[upper]);
    }

    public static int getUpper(int[] arr, int target) {
        int len = arr.length;
        if (len == 0) {
            return -1;
        }
        int low = 0;
        int high = len - 1;
        if (target > arr[high]) {
            return -1;
        }
        int mid = low + (high - low) >> 1;
        while (high > low) {
            if (arr[mid] > target) {
                high = mid;
            }
            else  {
                low = mid + 1;
            }
            mid = low + (high - low) >> 1;
        }
        return mid;

    }

}
