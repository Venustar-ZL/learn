package stringTest;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-30 17:32
 * @Author: ZhangLei
 * version: 1.0
 **/
public class SearchInRoll {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 1, 2};
        int result = getResult(arr, 5);
        System.out.println(result);

    }

    public static int getResult(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            int mid = low + (high - low) >> 1;
            if (target < arr[mid]) {
                if (arr[low] < arr[mid]) {
                    high = mid - 1;
                }
                else {

                }
            }

        }
        return -1;
    }

}
