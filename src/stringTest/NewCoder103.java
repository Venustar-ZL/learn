package stringTest;

import java.util.Scanner;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-23 13:41
 * @Author: ZhangLei
 * version: 1.0
 **/
public class NewCoder103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nonFibonacci(n));
    }

    // 递归
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 非递归
    public static int nonFibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

}
