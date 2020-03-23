package com.lance.study.algorithm;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 2, 7};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sort(arr);

    }

    public static void sort(int[] arr) {
        // 外层循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制每趟比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
