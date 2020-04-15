package stringTest;

import java.util.Scanner;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-03-23 10:15
 * @Author: ZhangLei
 * version: 1.0
 **/
class NewCoder101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int order = sc.nextInt();
        String[] arr = new String[count];
//        for (int i = 0; i < count; i++) {
//            String name = sc.next();
//            int value = sc.nextInt();
//            arr[i] = name + " " +value;
//        }
        int i = 0;
        while (sc.hasNext()) {
            String name = sc.next();
            int value = sc.nextInt();
            arr[i++] = name + " " + value;
            if (i == count) {
                break;
            }
        }
        System.out.println("排序前：");
        for (String str : arr) {
            System.out.println(str);
        }
        sort(arr, count, order);
        System.out.println("排序后：");
        for (String str : arr) {
            System.out.println(str);
        }
    }


    // 0降序 1升序
    public static void sort(String[] arr , int count, int order) {

        // 冒泡排序
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                String[] temp1 = arr[j].split(" ");
                int value1 = Integer.parseInt(temp1[1]);
                String[] temp2 = arr[j + 1].split(" ");
                int value2 = Integer.parseInt(temp2[1]);
                if (order == 1 ? value2 < value1 : value1 < value2) {
                    String a = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = a;
                }
            }
        }

        // 选择排序
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                int minIndex = i;
                String[] temp1 = arr[minIndex].split(" ");
                int value1 = Integer.parseInt(temp1[1]);
                String[] temp2 = arr[j].split(" ");
                int value2 = Integer.parseInt(temp2[1]);
                if (order == 1 ? value1 > value2 : value1 < value1) {
                    minIndex = j;
                }
                // 交换
                String a  = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = a;
            }
        }
    }
}
