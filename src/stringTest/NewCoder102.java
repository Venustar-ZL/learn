package stringTest;

/**
 * @ClassName: NewCoder102
 * @Description:
 * @Date: 2020-03-23 13:33
 * @Author: ZhangLei
 * version: 1.0
 **/
public class NewCoder102 {

    public boolean find(int target, int[][] arr) {
        if (arr == null) {
            return false;
        }
        int row = arr.length;
        int col = arr[0].length;
        int i = row - 1, j = 0;
        while(i >= 0 && j < col) {
            if (target > arr[i][j]) {
                j++;
            }
            if (target < arr[i][j]) {
                i--;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
