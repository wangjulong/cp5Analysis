package com.wangjulong.cp5;

/**
 * 静态函数，打印整形数组
 * Created by Administrator on 2016/9/25.
 */
public class PrintArr {

    /**
     * 打印二维整形数组
     *
     * @param arr 二维整形数组
     */
    public static void printArrx2(int[][] arr) {
        System.out.println("打印二维数组开始！");

        for (int[] temp : arr) {
            for (int tempa : temp) {
                System.out.print(tempa + " ");
            }
            System.out.println();
        }

        System.out.println("打印二维数组结束！");
    }
}
